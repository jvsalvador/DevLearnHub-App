package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.Java_Activity
import com.example.devlearnhub.databinding.JavaModule44Binding

class Java_Module4_4 : AppCompatActivity() {
    private lateinit var binding: JavaModule44Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule44Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext23.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module4_5::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}