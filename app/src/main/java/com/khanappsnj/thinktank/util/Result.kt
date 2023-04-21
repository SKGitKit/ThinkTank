package com.khanappsnj.thinktank.util

sealed class Result<out T : Any> {
    data class Success<out T : Any>(val data: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
}

inline fun <T : Any> Result<T>.onSuccess(action: (T) -> Unit): Result<T> {
    if (this is Result.Success) {
        action(data)
    }
    return this
}

inline fun <T : Any> Result<T>.onError(action: (Exception) -> Unit) {
    if (this is Result.Error) {
        action(exception)
    }
}

class ApiResponse<T> {
    var status: Int = 0
    var data: T? = null
    var message: String? = null

    val isSuccess: Boolean
        get() = status in 200..299
}