package com.example.newapp.presentation

import com.example.newapp.domain.model.HeadlineResponseDTO

data class HeadlinesState(
    val isLoading: Boolean = false,
    val error: String = "",
    val data: List<HeadlineResponseDTO>? = null
)