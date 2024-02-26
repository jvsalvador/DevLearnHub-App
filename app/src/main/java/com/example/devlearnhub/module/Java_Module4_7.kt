package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JavaModule47Binding

class Java_Module4_7 : AppCompatActivity() {
    private lateinit var binding: JavaModule47Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule47Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext26.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module4_8::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}