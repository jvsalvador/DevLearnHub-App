package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.Java_Activity
import com.example.devlearnhub.databinding.JavaModule51Binding

class Java_Module5_1 : AppCompatActivity() {
    private lateinit var binding: JavaModule51Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule51Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackJava1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnTapToNext29.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module5_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}