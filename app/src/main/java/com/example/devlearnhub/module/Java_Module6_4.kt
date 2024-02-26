package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JavaModule64Binding

class Java_Module6_4 : AppCompatActivity() {
    private lateinit var binding: JavaModule64Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule64Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext38.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module6_5::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}