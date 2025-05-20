package com.example.newapp.presentation

import com.example.newapp.domain.model.HeadlineResponseDTO

data class HealinesState(
    val isLoading: Boolean = false,
    val error: String = "",
    val data: List<HeadlineResponseDTO>? = null
)