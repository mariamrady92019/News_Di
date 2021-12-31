package com.route.newappc35fri.model

import com.google.gson.annotations.SerializedName
import java.text.SimpleDateFormat
import java.util.*

data class NewsResponse(

    @field:SerializedName("totalResults")
    val totalResults: Int? = null,

    @field:SerializedName("articles")
    val articles: List<ArticlesItem?>? = null,
) : BaseResponse()

data class ArticlesItem(

    @field:SerializedName("publishedAt")
    val publishedAt: String? = null,

    @field:SerializedName("author")
    val author: String? = null,

    @field:SerializedName("urlToImage")
    val urlToImage: String? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("source")
    val source: SourcesItem? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("url")
    val url: String? = null,

    @field:SerializedName("content")
    val content: String? = null
) {

    fun formatDate(): String {
        return publishedAt ?: "";
//        val inputFormatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ",Locale.ENGLISH);
//        val date = inputFormatter.parse(publishedAt);
//        val outputFormatter = SimpleDateFormat("MMM dd hh:mm a", Locale.getDefault());
//        return outputFormatter.format(date);
    }
}
