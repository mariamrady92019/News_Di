package com.route.newappc35fri.ui.news

import com.route.newappc35fri.model.NewsResponse

interface NewsReboSotiry {
  suspend fun getNews(apiKey : String , source : String): NewsResponse

}
interface NewsOnlineDataSource{
 suspend fun getNewsFromOnlineDataSource(apiKey : String , source : String)  : NewsResponse
}