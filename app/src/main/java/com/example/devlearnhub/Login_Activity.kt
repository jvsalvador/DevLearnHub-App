package com.example.devlearnhub

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.data.DatabaseHelper
import com.example.devlearnhub.data.ValidationUtils
import com.example.devlearnhub.databinding.LayoutLoginActivityBinding

class Login_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutLoginActivityBinding
    private lateinit var db: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutLoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = DatabaseHelper(this)

        binding.tvLoginSignUp.setOnClickListener {
            startActivity(Intent(this, Register_Activity::class.java))
        }

        binding.btLoginLogin.setOnClickListener {
            loginUser()
        }
    }

    private fun loginUser() {
        val email = binding.etLoginNumberOrEmail.text.toString().trim()
        val password = binding.etLoginPassword.text.toString().trim()

        if (ValidationUtils.isTextNotEmpty(email) && ValidationUtils.isTextNotEmpty(password)) {
            if (ValidationUtils.isValidEmail(email)) {
                val isSuccess = db.loginUser(email, password)
                if (isSuccess) {
                    // Pass the email to Choices_Activity
                    val intent = Intent(this, Choices_Activity::class.java)
                    intent.putExtra("user_email", email)
                    startActivity(intent)
                    finish()
                }
            } else {
                Toast.makeText(this, "Invalid format email", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Please enter all field", Toast.LENGTH_SHORT).show()
        }
    }
}