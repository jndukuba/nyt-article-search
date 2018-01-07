package com.swstylez.nytarticlesearch;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by jndukuba on 1/5/2018.
 */
public interface ArticleSearchService {

    @GET("articlesearch.json?q={query}")
    Call<List<Article>> findArticles(@Path("query") final String query);

}
