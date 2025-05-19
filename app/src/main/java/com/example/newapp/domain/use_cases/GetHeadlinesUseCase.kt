package com.example.newapp.domain.use_cases

import com.example.newapp.data.common.Resource
import com.example.newapp.data.model.HeadlinesAPIResponse
import com.example.newapp.data.repository.HeadlineArticleRepository
import com.example.newapp.domain.model.HeadlineResponseDTO
import com.example.newapp.domain.repository.HeadlineRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.lang.Exception

class GetHeadlinesUseCase(val headlineArticleRepository: HeadlineArticleRepository) {
    operator fun invoke(): Flow<Resource<List<HeadlineResponseDTO>>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = headlineArticleRepository.getArticleItems()))

        } catch (e: Exception) {
            emit(Resource.Error(message = e.message.toString()))
        }
    }.flowOn(Dispatchers.IO)
}

