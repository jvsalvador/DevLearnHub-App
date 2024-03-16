package com.example.devlearnhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.devlearnhub.api.AuthService
import com.example.devlearnhub.data.ApiResponse
import com.example.devlearnhub.data.LoginRequest
import com.example.devlearnhub.data.RetrofitInstance
import com.example.devlearnhub.data.ValidationUtils
import com.example.devlearnhub.databinding.LayoutLoginActivityBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: LayoutLoginActivityBinding
    private lateinit var authService: AuthService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutLoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        authService = RetrofitInstance.getRetrofitInstance().create(AuthService::class.java)

        binding.tvLoginSignUp.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        binding.btLoginLogin.setOnClickListener {
            loginUser()
        }

        binding.tvLearnGuest.setOnClickListener {
            startActivity(Intent(this, ChoicesActivity::class.java))
        }

    }
    private fun loginUser() {
        val email = binding.etLoginNumberOrEmail.text.toString().trim()
        val password = binding.etLoginPassword.text.toString().trim()

        if (ValidationUtils.isTextNotEmpty(email) && ValidationUtils.isTextNotEmpty(password)) {
            if (ValidationUtils.isValidEmail(email)) {
                val loginRequest = LoginRequest(email, password)
                val call = RetrofitInstance.getAuthService().login(loginRequest)
                call.enqueue(object : Callback<ApiResponse> {
                    override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                        if (response.isSuccessful) {
                            val apiResponse = response.body()
                            if (apiResponse != null) {
                                val email = intent.getStringExtra("user_email")
                                startActivity(Intent(this@LoginActivity, ChoicesActivity::class.java))
                                intent.putExtra("user_email", email)
                                finish()
                            } else {
                                Toast.makeText(this@LoginActivity, "Invalid email or password", Toast.LENGTH_SHORT).show()
                            }
                        } else {
                            Toast.makeText(this@LoginActivity, "Error: ${response.code()}", Toast.LENGTH_SHORT).show()
                        }
                    }

                    override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                        Toast.makeText(this@LoginActivity, "Error: ${t.message}", Toast.LENGTH_SHORT).show()
                    }
                })
            } else {
                Toast.makeText(this, "Invalid format email", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT).show()
        }
    }
}