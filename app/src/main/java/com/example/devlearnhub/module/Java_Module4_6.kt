package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JavaModule46Binding

class Java_Module4_6 : AppCompatActivity() {
    private lateinit var binding: JavaModule46Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule46Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext25.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module4_7::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}