package com.example.newapp.data.di

import com.example.newapp.data.network.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object DataModule {
/*api key=653d38ac6fa548b693bf0e95c9a48c25*/
    @Provides
    fun provideApiServices(): ApiService {
        return Retrofit.Builder().baseUrl("https://newsapi.org/v2/").addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiService::class.java)
    }
}