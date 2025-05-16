package com.example.newapp.domain.repository

import com.example.newapp.domain.model.HeadlineResponseDTO

interface HeadlineRepository {
    suspend fun getArticleItems(): List<HeadlineResponseDTO>
}