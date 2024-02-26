package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JavaModule62Binding
import com.example.devlearnhub.databinding.JavaModule65Binding

class Java_Module6_5 : AppCompatActivity() {
    private lateinit var binding: JavaModule65Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule65Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext39.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module6_6::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}