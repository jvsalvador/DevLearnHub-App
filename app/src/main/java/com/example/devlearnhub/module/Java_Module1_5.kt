package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.Java_Activity
import com.example.devlearnhub.databinding.JavaModule15Binding

class Java_Module1_5 : AppCompatActivity() {
    private lateinit var binding: JavaModule15Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule15Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnJavaNext5.setOnClickListener {
            val intent = Intent(this, Java_Activity::class.java)
            startActivity(intent)
        }
    }
}