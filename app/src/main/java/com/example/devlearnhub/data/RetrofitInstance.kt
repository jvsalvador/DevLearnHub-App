package com.example.devlearnhub.data

import com.example.devlearnhub.api.AuthService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    const val BASE_URL = "https://devlearn-com.preview-domain.com/public/users/login/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getRetrofitInstance(): Retrofit {
        return retrofit
    }

    fun getAuthService(): AuthService{
        return retrofit.create(AuthService::class.java)
    }
}