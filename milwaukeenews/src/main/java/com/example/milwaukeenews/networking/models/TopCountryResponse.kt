package com.example.milwaukeenews.networking.models

data class TopCountryResponse (
    val status: String,
    val totalResults: Long,
    val articles: List<Article>
)