package com.swstylez.nytarticlesearch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ArticleSearchActivity extends AppCompatActivity {

    private Retrofit retrofit;

    private ArticleSearchService apiService;

    private List<Article> articles;

    private ArticlesAdapter articlesAdapter;

    private RecyclerView searchResultsView;

    private EditText searchTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_search);

        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();

        Interceptor interceptor = new Interceptor() {

            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {

                Request originalRequest = chain.request();
                HttpUrl originalUrl = originalRequest.url();
                String apiKeyParamName = getString(R.string.apiKeyParamName);
                String apiKey = getString(R.string.apiKey);
                HttpUrl url = originalUrl.newBuilder().addQueryParameter(apiKeyParamName, apiKey).build();

                return chain.proceed(originalRequest.newBuilder().url(url).build());

            }

        };

        clientBuilder.addInterceptor(interceptor);

        searchResultsView = (RecyclerView) findViewById(R.id.searchResultsView);
        searchTextView = (EditText) findViewById(R.id.searchTextView);

        articles = new LinkedList<>();

        articlesAdapter = new ArticlesAdapter(this, articles);

        retrofit = new Retrofit.Builder()
                               .baseUrl(getString(R.string.baseUrl))
                               .addConverterFactory(GsonConverterFactory.create())
                               .client(clientBuilder.build())
                               .build();

        apiService = retrofit.create(ArticleSearchService.class);

        searchResultsView.setAdapter(articlesAdapter);
        searchResultsView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

    }

    public void performSearch(final View view) {

        String query = searchTextView.getText().toString();
        Call<ArticleSearchResponse> articleSearchCall = apiService.findArticles(query);

        articleSearchCall.enqueue(new Callback<ArticleSearchResponse>() {

            @Override
            public void onResponse(Call<ArticleSearchResponse> call, Response<ArticleSearchResponse> response) {

                if(response.body() != null) {
                    articles.clear();
                    articles.addAll(response.body().getResponse().getDocs());
                }

                articlesAdapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<ArticleSearchResponse> call, Throwable t) {
                t.printStackTrace();
            }

        });

    }

}
