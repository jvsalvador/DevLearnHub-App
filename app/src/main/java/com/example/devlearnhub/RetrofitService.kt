package com.example.devlearnhub

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {
    @GET("users")
    fun getUsers(): Call<User>
}