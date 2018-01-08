package com.swstylez.nytarticlesearch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jndukuba on 1/5/2018.
 */
public interface ArticleSearchService {

    @GET("articlesearch.json")
    Call<ArticleSearchResponse> findArticles(@Query("q") final String query);

}
