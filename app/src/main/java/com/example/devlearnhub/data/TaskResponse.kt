package com.example.devlearnhub.data


data class TaskResponse(
    val success: Boolean,
    val message: String,
    val data: List<TaskData>
)
