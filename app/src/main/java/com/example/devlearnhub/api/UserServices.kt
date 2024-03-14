package com.example.devlearnhub.api

import com.example.devlearnhub.data.ApiResponse
import com.example.devlearnhub.data.RegistrationRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface UserServices {
    @GET("users/register/")
    fun getData(): Call<ApiResponse>

    @POST("users/register")
    fun registerUser(@Body request: RegistrationRequest): Call<ApiResponse>
}