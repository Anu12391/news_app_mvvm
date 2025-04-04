package com.example.newapp.data.common


import com.example.newapp.data.model.ArticlesAPIItem
import com.example.newapp.data.model.HeadlinesAPIResponse
import com.example.newapp.data.model.SourceAPI
import com.example.newapp.domain.model.ArticlesItem
import com.example.newapp.domain.model.HeadlineResponse
import com.example.newapp.domain.model.Source

class Mappers {

    fun HeadlinesAPIResponse.toDomain(): HeadlineResponse {
        return HeadlineResponse(
            totalResults ?: 0,
            articles?.map { it.toDomain() } ?: emptyList(),
            status ?: ""
        )
    }

    fun ArticlesAPIItem.toDomain(): ArticlesItem {
        return ArticlesItem(
            publishedAt ?: "",
            author = author ?: "",
            urlToImage = urlToImage ?: "",
            description = description ?: "",
            source = source?.toDomain() ?: Source("", ""),
            title = title ?: "",
            url = url ?: "",
            content = content ?: "",
        )
    }

    fun SourceAPI.toDomain(): Source {
        return Source(
            name = name ?: "",
            id = id ?: ""
        )
    }
}