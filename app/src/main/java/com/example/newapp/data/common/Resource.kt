package com.example.newapp.data.common

sealed class Resource<out T>(message: String? = null, data: T? = null) {
    class Loading<T> : Resource<T>()
    class Success<T>(val data: T?) : Resource<T>(data = data)
    class Error<T>(val data: T? = null, val message: String?) :
        Resource<T>(data = data, message = message)
}