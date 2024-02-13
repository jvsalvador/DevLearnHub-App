package com.example.devlearnhub

import retrofit2.Call
import retrofit2.http.GET
import com.example.devlearnhub.Users

interface RetrofitService {
    @GET("/getData.php")
    fun getData(): Call<List<Users>>
}