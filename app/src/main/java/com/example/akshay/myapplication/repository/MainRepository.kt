package com.example.akshay.myapplication.repository

import com.example.akshay.myapplication.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}