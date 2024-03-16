package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.KotlinModule21Binding
import com.example.devlearnhub.databinding.KotlinModule22Binding
import com.example.devlearnhub.module_activity.KotlinActivity

class Kotlin_Module2_2 : AppCompatActivity() {
    private lateinit var binding: KotlinModule22Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = KotlinModule22Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kotlinTapToNext5.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Kotlin_Module2_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}