package com.example.devlearnhub.data

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {
    @GET("/getData.php")
    fun getData(): Call<List<Users>>
}