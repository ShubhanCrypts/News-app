package com.cryptsproject.mvvmnews.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.cryptsproject.mvvmnews.models.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    //update or insert
    suspend fun upsert(article: Article): Long

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)

}