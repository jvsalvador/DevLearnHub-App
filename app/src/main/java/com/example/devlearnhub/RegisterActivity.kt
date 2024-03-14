package com.example.devlearnhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.devlearnhub.api.UserServices
import com.example.devlearnhub.data.ApiResponse
import com.example.devlearnhub.data.DatabaseHelper
import com.example.devlearnhub.data.RegistrationRequest
import com.example.devlearnhub.data.Users
import com.example.devlearnhub.data.ValidationUtils
import com.example.devlearnhub.databinding.LayoutRegisterActivityBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: LayoutRegisterActivityBinding
    private lateinit var db: DatabaseHelper
    private lateinit var userServices: UserServices

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutRegisterActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = DatabaseHelper(this)


        val retrofit = Retrofit.Builder()
            .baseUrl("https://devlearn-com.preview-domain.com/public/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        userServices = retrofit.create(UserServices::class.java)

        binding.btRegisterCreateAccount.setOnClickListener {
            registerUser()
        }
        binding.tvRegisterLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    private fun registerUser() {
        val name = binding.etRegisterName.text.toString()
        val email = binding.etRegisterEmail.text.toString()
        val password = binding.etRegisterPassword.text.toString()
        val confirm = binding.etRegisterConfirm.text.toString()

        if (ValidationUtils.isTextNotEmpty(name) &&
            ValidationUtils.isTextNotFill(email) &&
            ValidationUtils.isTextNotEmpty(password) &&
            ValidationUtils.isTextNotEmpty(confirm)
        ) {
            if (ValidationUtils.isValidEmail(email)) {

                val registrationRequest = RegistrationRequest(name, email.trim(), password)
                registerUserRemote(registrationRequest)
            } else {
                Toast.makeText(this, "Invalid email format", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Please input all fields", Toast.LENGTH_SHORT).show()
        }
    }

    private fun registerUserRemote(registrationRequest: RegistrationRequest) {
        val call = userServices.registerUser(registrationRequest)

        call.enqueue(object : Callback<ApiResponse> {
            override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                if (response.isSuccessful) {
                    val apiResponse = response.body()
                    if (apiResponse != null) {

                        if (apiResponse.isSuccess) {

                            val user = Users(name = registrationRequest.name, email = registrationRequest.email, password = registrationRequest.password)
                            db.registerUser(user)


                            Toast.makeText(this@RegisterActivity, "User registered successfully", Toast.LENGTH_SHORT).show()


                            startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
                            finish()
                        } else {

                            Toast.makeText(this@RegisterActivity, apiResponse.message, Toast.LENGTH_SHORT).show()
                        }
                    } else {

                        Toast.makeText(this@RegisterActivity, "Error: ${response.message()}", Toast.LENGTH_SHORT).show()
                    }
                } else {

                    Toast.makeText(this@RegisterActivity, "Error: ${response.message()}", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {

                Toast.makeText(this@RegisterActivity, "Error: ${t.localizedMessage}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}