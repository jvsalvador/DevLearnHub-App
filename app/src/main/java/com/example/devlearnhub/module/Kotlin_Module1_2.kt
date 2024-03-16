package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.KotlinModule12Binding

class Kotlin_Module1_2 : AppCompatActivity() {
    private lateinit var binding: KotlinModule12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = KotlinModule12Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kotlinTapToNext2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Kotlin_Module1_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}