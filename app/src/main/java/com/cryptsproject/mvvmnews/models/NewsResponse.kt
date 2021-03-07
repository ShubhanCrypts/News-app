package com.cryptsproject.mvvmnews.models

import com.cryptsproject.mvvmnews.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)