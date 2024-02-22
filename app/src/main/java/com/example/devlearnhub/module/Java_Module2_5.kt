package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.JavaModule25Binding

class Java_Module2_5 : AppCompatActivity() {
    private lateinit var binding: JavaModule25Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule25Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext12.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module2_6::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}