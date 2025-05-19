package com.example.newapp.data.common

sealed class Resource<out T>(val message: String? = null, val data: T? = null) {
    class Loading<T> : Resource<T>()
    class Success<T>(data:T?) : Resource<T>(data=data)
    class Error<T>(data:T?=null,message:String?) : Resource<T>(data=data, message = message)
}