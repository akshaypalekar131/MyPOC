package com.example.akshay.myapplication.api

import com.example.akshay.myapplication.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers() : List<User>
}