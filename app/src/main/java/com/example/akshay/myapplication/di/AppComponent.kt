package com.example.akshay.myapplication.di

import com.example.akshay.myapplication.api.ApiHelper
import com.example.akshay.myapplication.repository.MainRepository
import com.example.akshay.myapplication.ui.base.ViewModelFactory
import com.example.akshay.myapplication.ui.main.view.MainActivity
import com.example.akshay.myapplication.ui.main.viewmodel.MainViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            AppModule::class,
            ApiHelperModule::class,
            RepositoryModule::class,
            ViewModelFactoryModule::class
        ]
)
interface AppComponent {

    fun inject(activity: MainActivity)
    fun inject(apiHelper: ApiHelper)
    fun inject(viewModelFactoryFactory:ViewModelFactory)
    fun inject(mainRepository: MainRepository)
    fun inject(mainViewModel: MainViewModel)
}