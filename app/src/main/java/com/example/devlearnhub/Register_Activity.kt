package com.example.devlearnhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.devlearnhub.api.UserServices
import com.example.devlearnhub.data.ApiResponse
import com.example.devlearnhub.data.DatabaseHelper
import com.example.devlearnhub.data.RegistrationRequest
import com.example.devlearnhub.databinding.LayoutRegisterActivityBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Register_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutRegisterActivityBinding
    private lateinit var db: DatabaseHelper
    private val BASE_URL = "https://campushive-com.preview-domain.com/public/api/"
    private val TAG = "Register-Response"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutRegisterActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = DatabaseHelper(this)
        binding.btRegisterCreateAccount.setOnClickListener {
            val firstname = binding.etRegisterFirstname.text.toString().trim()
            val lastname = binding.etRegisterLastName.text.toString().trim()
            val email = binding.etRegisterEmail.text.toString().trim()
            val password = binding.etRegisterPassword.text.toString().trim()
            val confirmPassword = binding.etRegisterConfirm.text.toString().trim()

            if (firstname.isNotEmpty() && lastname.isNotEmpty() && email.isNotEmpty() &&
                password.isNotEmpty() && confirmPassword.isNotEmpty()
            ) {
                if (password == confirmPassword) {
                    registerUser(firstname, lastname, email, password)
                } else {
                    // Display an error message if passwords do not match
                    Log.e(TAG, "Passwords do not match")
                }
            } else {
                // Display an error message if any field is empty
                Log.e(TAG, "All fields are required")
            }
        }

        binding.tvRegisterLogin.setOnClickListener {
            startActivity(Intent(this, Login_Activity::class.java))
        }
    }

    private fun registerUser(name: String, email: String, phone: String, password: String) {
        val api = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserServices::class.java)

        val request = RegistrationRequest(name, email, phone, password)

        api.registerUser(request).enqueue(object : Callback<ApiResponse> {
            override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                if (response.isSuccessful) {
                    // Registration successful, handle response accordingly
                    // For example, navigate to the login screen
                    Log.d(TAG, "Registration successful")
                } else {
                    // Registration failed, handle response accordingly
                    Log.e(TAG, "Registration failed: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                // Handle failure to connect to the server
                Log.e(TAG, "Registration failed: ${t.message}", t)
            }
        })
    }
}