package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JavaModule48Binding

class Java_Module4_8 : AppCompatActivity() {
    private lateinit var binding: JavaModule48Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule48Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext27.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module4_9::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}