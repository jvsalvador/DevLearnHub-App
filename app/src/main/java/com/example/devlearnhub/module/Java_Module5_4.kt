package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JavaModule54Binding

class Java_Module5_4 : AppCompatActivity() {
    private lateinit var binding: JavaModule54Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule54Binding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnTapToNext32.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module5_5::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}