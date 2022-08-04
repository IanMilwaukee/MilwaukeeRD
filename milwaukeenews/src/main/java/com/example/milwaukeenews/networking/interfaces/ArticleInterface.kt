package com.example.milwaukeenews.networking.interfaces

import com.example.milwaukeenews.BuildConfig
import com.example.milwaukeenews.networking.models.TopCountryResponse
import retrofit2.http.GET
import retrofit2.http.Query
interface ArticleInterface {

    @GET("top-headlines")
    suspend fun getCountryArticleAsync(
        @Query(value = "country") country: String,
        @Query(value = "apiKey") apiKey: String = BuildConfig.API_KEY
    ): TopCountryResponse
}