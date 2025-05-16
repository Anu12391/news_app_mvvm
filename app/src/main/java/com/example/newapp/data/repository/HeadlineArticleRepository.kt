package com.example.newapp.data.repository

import com.example.newapp.data.common.toDomain
import com.example.newapp.data.network.ApiService
import com.example.newapp.domain.model.HeadlineResponseDTO
import com.example.newapp.domain.repository.HeadlineRepository

class HeadlineArticleRepository(private val apiService: ApiService) : HeadlineRepository {
    override suspend fun getArticleItems(): List<HeadlineResponseDTO> {
        return apiService.getTopHeadLines().map { it.toDomain() }
    }
}