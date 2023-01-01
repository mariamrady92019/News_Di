package com.route.newappc35fri.ui.news

import com.route.newappc35fri.api.Services
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class NewsModuleDi {

    @Provides
    fun provideNewsRebosotiry(newsOnlineDataSource: NewsOnlineDataSource):NewsReboSotiry{
        return NewsRebosotiryIMpl(newsOnlineDataSource)
    }

    @Provides
    fun provideNewsOnlineDataSource(services:Services):NewsOnlineDataSource{
        return NewsOnlineDataSourceImpl(services)
    }



}