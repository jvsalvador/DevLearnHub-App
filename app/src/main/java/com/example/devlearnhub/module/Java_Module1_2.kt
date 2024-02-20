package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JavaModule12Binding

class Java_Module1_2 : AppCompatActivity() {
    private lateinit var binding: JavaModule12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule12Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnJavaNext2.setOnClickListener {
            val intent = Intent(this, Java_Module1_3::class.java)
            startActivity(intent)
        }
    }
}