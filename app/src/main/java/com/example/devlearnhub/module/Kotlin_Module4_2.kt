package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.KotlinModule42Binding

class Kotlin_Module4_2 : AppCompatActivity() {
    private lateinit var binding: KotlinModule42Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = KotlinModule42Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kotlinTapToNext11.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Kotlin_Module4_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}