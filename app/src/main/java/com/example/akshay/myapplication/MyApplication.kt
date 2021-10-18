package com.example.akshay.myapplication

import android.app.Application
import com.example.akshay.myapplication.di.AppComponent
import com.example.akshay.myapplication.di.DaggerAppComponent

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent
                .builder()
                .build()
    }
}

lateinit var component: AppComponent
