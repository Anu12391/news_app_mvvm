package com.example.newapp.data.network

import com.example.newapp.data.model.HeadlinesAPIResponse
import com.example.newapp.domain.model.HeadlineResponseDTO
import retrofit2.http.GET

interface ApiService {
    @GET("top-headlines?country=us&category=business&apiKey=653d38ac6fa548b693bf0e95c9a48c25")
    suspend fun getTopHeadLines(): List<HeadlinesAPIResponse>




}