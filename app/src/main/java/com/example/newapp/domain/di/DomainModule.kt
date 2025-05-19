package com.example.newapp.domain.di

import com.example.newapp.data.repository.HeadlineArticleRepository
import com.example.newapp.domain.use_cases.GetHeadlinesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {

    @Provides
    fun getHeadlinesUseCase(headlineRepo: HeadlineArticleRepository): GetHeadlinesUseCase {
        return GetHeadlinesUseCase(headlineRepo)

    }

}