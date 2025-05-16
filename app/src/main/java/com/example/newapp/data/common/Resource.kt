package com.example.newapp.data.common

sealed class Resource<T>(message: String? = null, data: T? = null) {
    class Loading<T> : Resource<T>()
    class Success<T>(data:T?) : Resource<T>(data=data)
    class Error<T>(data:T?,message:String?) : Resource<T>(data=data, message = message)
}