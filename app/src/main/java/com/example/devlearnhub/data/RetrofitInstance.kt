package com.example.devlearnhub.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object RetrofitInstance {

    private const val BASE_URL = "https://devlearn-com.preview-domain.com/public/api/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getRetrofitInstance(): Retrofit {
        return retrofit
    }

}