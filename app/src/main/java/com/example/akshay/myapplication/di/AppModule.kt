package com.example.akshay.myapplication.di

import com.example.akshay.myapplication.api.ApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun providesRetrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://5e510330f2c0d300147c034c.mockapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    @Provides
    @Singleton
    fun providesApi(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}