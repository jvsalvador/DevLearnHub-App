package com.example.devlearnhub.data

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.POST

interface UserApi {
    @POST("login")
    fun login(@Field("email")email: String, @Field("password") password: String): Call<LoginResponse>

    @POST("tasks")
    fun getTasks(): Call<TaskResponse>
}