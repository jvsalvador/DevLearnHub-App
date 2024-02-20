package com.example.devlearnhub.data

import retrofit2.Call
import retrofit2.http.GET

interface TaskApi {
    @GET("task")
    fun getTask(): Call<List<TaskData>>
}