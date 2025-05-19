package com.example.newapp.data.di

import com.example.newapp.data.network.ApiService
import com.example.newapp.data.repository.HeadlineArticleRepository
import com.example.newapp.domain.repository.HeadlineRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DataModule {
    /*api key=653d38ac6fa548b693bf0e95c9a48c25*/
    @Singleton
    @Provides
    fun provideApiServices(): ApiService {
        return Retrofit.Builder().baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiService::class.java)
    }

    @Provides
    fun getNewsRepositoryImp(apiService: ApiService): HeadlineArticleRepository {
        return HeadlineArticleRepository(apiService)
    }
}