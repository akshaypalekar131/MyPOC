package com.example.akshay.myapplication.di

import com.example.akshay.myapplication.api.ApiHelper
import com.example.akshay.myapplication.api.ApiService
import dagger.Module
import dagger.Provides

@Module
class ApiHelperModule {

    @Provides
    fun provideApiHelper(apiService: ApiService):ApiHelper{
        return ApiHelper(apiService)
    }

}