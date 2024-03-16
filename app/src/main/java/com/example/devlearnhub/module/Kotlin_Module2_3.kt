package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.KotlinModule23Binding
import com.example.devlearnhub.module_activity.KotlinActivity

class Kotlin_Module2_3 : AppCompatActivity() {
    private lateinit var binding: KotlinModule23Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = KotlinModule23Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kotlinTapToNext7.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, KotlinActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}