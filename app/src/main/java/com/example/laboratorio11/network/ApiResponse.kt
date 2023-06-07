package com.example.laboratorio11.network

import java.lang.Exception

//sealed class es una coleccion de clases/ wrapper de clases ; ocupar when para acceder a cada una de las clases
sealed class ApiResponse<T> {
    // a class to handle the success response
    data class Success<T>(val data: T) : ApiResponse<T>()

    // a class to handle the error response
    data class Error<T>(val exception: Exception) : ApiResponse<T>()

    // a class to handle the error response with a message
    data class ErrorWithMessage<T>(val message: String) : ApiResponse<T>()

}