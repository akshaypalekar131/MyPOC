package com.example.akshay.myapplication.di

import com.example.akshay.myapplication.repository.MainRepository
import com.example.akshay.myapplication.ui.base.ViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ViewModelFactoryModule {

    @Provides
    fun provideViewModelFactory(mainRepository: MainRepository): ViewModelFactory{
        return ViewModelFactory(mainRepository)
    }

}