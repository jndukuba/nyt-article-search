package com.swstylez.nytarticlesearch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_search);

        RecyclerView searchResultsView = (RecyclerView) findViewById(R.id.searchResultsView);

        articles = new LinkedList<>();

        articlesAdapter = new ArticlesAdapter(this, articles);

        retrofit = new Retrofit.Builder()
                               .baseUrl(getString(R.string.baseUrl))
                               .addConverterFactory(GsonConverterFactory.create())
                               .build();

        apiService = retrofit.create(ArticleSearchService.class);

        searchResultsView.setAdapter(articlesAdapter);
        searchResultsView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

    }

    public void performSearch(View view) {

        EditText searchTextView = (EditText) findViewById(R.id.searchTextView);
        String query = searchTextView.getText().toString();
        Call<List<Article>> articleSearchCall = apiService.findArticles(query);

        articleSearchCall.enqueue(new Callback<List<Article>>() {

            @Override
            public void onResponse(Call<List<Article>> call, Response<List<Article>> response) {
//                articles.addAll(response.body());
//                articlesAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Article>> call, Throwable t) {

            }

        });

    }

}
