package com.example.devlearnhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.devlearnhub.data.DatabaseHelper
import com.example.devlearnhub.data.Users
import com.example.devlearnhub.data.ValidationUtils
import com.example.devlearnhub.databinding.LayoutRegisterActivityBinding

class Register_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutRegisterActivityBinding
    private lateinit var db: DatabaseHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutRegisterActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = DatabaseHelper(this)
        binding.btRegisterCreateAccount.setOnClickListener {
            registerUser()
        }

        binding.tvRegisterLogin.setOnClickListener {
            startActivity(Intent(this,Login_Activity::class.java))
        }
    }

    private fun registerUser()  {
        val firstname = binding.etRegisterFirstname.text.toString()
        val lastname = binding.etRegisterLastName.text.toString()
        val email = binding.etRegisterEmail.text.toString()
        val password = binding.etRegisterPassword.text.toString()
        val confirm = binding.etRegisterConfirm.text.toString()

        if (ValidationUtils.isTextNotEmpty(firstname) &&
            ValidationUtils.isTextNotEmpty(lastname) &&
            ValidationUtils.isTextNotFill(email) &&
            ValidationUtils.isTextNotEmpty(password) &&
            ValidationUtils.isTextNotEmpty(confirm)
        ) {
            if (ValidationUtils.isValidEmail(email)) {
                val user = Users(firstname = firstname, lastname = lastname, email = email.trim(), password = password, confirm = confirm)
                db.registerUser(user)
                Toast.makeText(this, "User Registered", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Invalid email format", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Please input all field", Toast.LENGTH_SHORT).show()
        }
    }

}