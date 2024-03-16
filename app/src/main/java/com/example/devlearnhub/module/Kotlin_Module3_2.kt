package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.KotlinModule32Binding

class Kotlin_Module3_2 : AppCompatActivity() {
    private lateinit var binding: KotlinModule32Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = KotlinModule32Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kotlinTapToNext9.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Kotlin_Module3_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}