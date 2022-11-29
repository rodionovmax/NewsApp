package com.rodionovmax.newsapp.network.model

import com.rodionovmax.newsapp.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)