package com.example.akshay.myapplication.di

import com.example.akshay.myapplication.api.ApiHelper
import com.example.akshay.myapplication.repository.MainRepository
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun provideRepository(apiHelper: ApiHelper):MainRepository{
        return MainRepository(apiHelper)
    }
}