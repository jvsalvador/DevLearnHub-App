package com.example.devlearnhub.data

data class RegistrationRequest(
    val firstName: String,
    val lastName: String,
    val password: String,
    val confirm: String,
)