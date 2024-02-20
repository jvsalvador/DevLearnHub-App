package com.example.devlearnhub.data

class UserRepository {
    private val userApi = RetrofitClient.instance.create(UserApi::class.java)

    suspend fun login(email: String, password: String): Result<LoginResponse> {
        return try {
            val response = userApi.login(email, password).execute()
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(RuntimeException("Failed to login"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}