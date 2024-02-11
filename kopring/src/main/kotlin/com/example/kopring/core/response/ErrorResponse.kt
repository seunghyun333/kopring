package com.example.kopring.core.response

data class ErrorResponse (
    val message: String,
    val errorType: String = "Invalid Argument"
)