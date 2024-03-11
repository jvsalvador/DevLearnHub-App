package com.example.devlearnhub.api

import com.example.devlearnhub.data.LoginRequest
import com.example.devlearnhub.data.ApiResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
interface AuthService {
    @POST("auth/login")
    fun login(@Body request: LoginRequest): Call<ApiResponse>
}