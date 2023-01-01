package com.route.newappc35fri.ui.news

import com.route.newappc35fri.model.NewsResponse

class NewsRebosotiryIMpl(val newsOnlineDataSource: NewsOnlineDataSource) : NewsReboSotiry{

    override suspend fun getNews(apiKey: String, source: String): NewsResponse {
        try {
            return newsOnlineDataSource.getNewsFromOnlineDataSource(apiKey,source)
        } catch (e: Exception) {

        throw e
        }
    }
}