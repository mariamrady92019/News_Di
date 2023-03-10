package com.route.newappc35fri.ui.news

import android.util.Log
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.route.newappc35fri.Constants
import com.route.newappc35fri.api.ApiManager
import com.route.newappc35fri.api.Services
import com.route.newappc35fri.model.ArticlesItem
import com.route.newappc35fri.model.NewsResponse
import com.route.newappc35fri.model.SourcesItem
import com.route.newappc35fri.model.SourcesResponse
import com.route.newappc35fri.ui.categories.Category
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(val newsReboSotiry: NewsReboSotiry): ViewModel() {
    val sourcesLiveData = MutableLiveData<List<SourcesItem?>?>()
    val progressBarVisible = MutableLiveData<Boolean>(false)
    val newsList = MutableLiveData<List<ArticlesItem?>?>()





    fun getNewsSources(category: Category) {



        viewModelScope.launch {
            try {
                progressBarVisible.value = true
                val result = ApiManager.getApis().getNewsSources(Constants.apiKey, category.id)
                progressBarVisible.value = false;
                sourcesLiveData.value = result.sources
            } catch (ex: Exception) {
                progressBarVisible.value = false;

            }
//                    Log.e("response", response.body().toString())

        }
//            .enqueue(object : Callback<SourcesResponse> {
//                override fun onFailure(call: Call<SourcesResponse>, t: Throwable) {
//                    progressBarVisible.value = false;
//                }
//
//                override fun onResponse(
//                    call: Call<SourcesResponse>,
//                    response: Response<SourcesResponse>
//                ) {
//                    progressBarVisible.value = false;
//                    sourcesLiveData.value = response.body()?.sources
//                    Log.e("response", response.body().toString())
//                }
//            })
    }

    fun loadNews(source: SourcesItem) {

        viewModelScope.launch {
            try {
                progressBarVisible.value = true;
                val result = newsReboSotiry.getNews(Constants.apiKey,source.id!!)
                    progressBarVisible.value = false;
                newsList.value = result.articles
            } catch (ex: Exception) {
                progressBarVisible.value = false;
            }

        }
//            .enqueue(object : Callback<NewsResponse> {
//                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
////                    Toast.makeText(
////                        requireContext(), "Error loading news",
////                        Toast.LENGTH_LONG
////                    ).show()
//                    progressBarVisible.value = false;
//
//                }
//
//                override fun onResponse(
//                    call: Call<NewsResponse>,
//                    response: Response<NewsResponse>
//                ) {
//                    progressBarVisible.value = false;
//                    newsList.value = response.body()?.articles
//                }
//            })
    }

}