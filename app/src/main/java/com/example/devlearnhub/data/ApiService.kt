package com.example.devlearnhub.data

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("login")
    fun loginUser(@Body loginRequest: LoginRequest, password: String): Call<LoginResponse>

    @POST("tasks")
    fun registerUser(@Body registrationRequest: RegistrationRequest): Call<RegistrationResponse>
}