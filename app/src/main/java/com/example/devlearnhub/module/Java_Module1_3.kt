package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JavaModule13Binding

class Java_Module1_3 : AppCompatActivity() {
    private lateinit var binding: JavaModule13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule13Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnJavaNext3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module1_4::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}