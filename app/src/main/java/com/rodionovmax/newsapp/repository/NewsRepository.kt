package com.rodionovmax.newsapp.repository

import com.rodionovmax.newsapp.db.ArticleDatabase
import com.rodionovmax.newsapp.network.api.RetrofitInstance

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)
}