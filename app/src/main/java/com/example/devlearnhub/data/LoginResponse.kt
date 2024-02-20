package com.example.devlearnhub.data

data class LoginResponse(
    val success: Boolean,
    val message: String,
    val data: TaskData
)