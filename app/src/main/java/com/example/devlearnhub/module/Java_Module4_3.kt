package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.Java_Activity
import com.example.devlearnhub.databinding.JavaModule43Binding

class Java_Module4_3 : AppCompatActivity() {
    private lateinit var binding: JavaModule43Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule43Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext22.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module4_4::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}