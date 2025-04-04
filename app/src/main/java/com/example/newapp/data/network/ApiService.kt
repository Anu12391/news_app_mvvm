package com.example.newapp.data.network

import retrofit2.http.GET

interface ApiService {
    @GET("")
    suspend fun getNewsList()
}