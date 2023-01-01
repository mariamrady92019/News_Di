package com.route.newappc35fri.ui.news

import com.route.newappc35fri.api.Services
import com.route.newappc35fri.model.NewsResponse

class NewsOnlineDataSourceImpl (val services: Services) : NewsOnlineDataSource {
    override suspend fun getNewsFromOnlineDataSource(apiKey: String, source: String): NewsResponse {

        try {
            return services.getNews(apiKey,source)
        } catch (e: Exception) {
          throw e;
        }

    }
}