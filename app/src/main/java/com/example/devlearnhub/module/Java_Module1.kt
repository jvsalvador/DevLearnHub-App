package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.module_activity.Java_Activity
import com.example.devlearnhub.databinding.JavaModule1Binding

class Java_Module1 : AppCompatActivity() {
    private lateinit var binding: JavaModule1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnJavaNext.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module1_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}