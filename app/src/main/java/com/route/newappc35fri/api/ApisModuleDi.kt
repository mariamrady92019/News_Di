package com.route.newappc35fri.api

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class ApisModuleDi {

    @Provides
    fun provideApisServices():Services{
        return ApiManager.getApis()
    }
}