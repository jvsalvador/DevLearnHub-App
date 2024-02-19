package com.example.devlearnhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.LayoutJavaActivityBinding
import com.example.devlearnhub.databinding.LayoutPythonActivityBinding

class Java_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutJavaActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutJavaActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToHome.setOnClickListener {
            val intent = Intent(this, Initial_Activity::class.java)
            startActivity(intent)
        }

        binding.btnNextLearn.setOnClickListener {
            val intent = Intent(this, com.example.devlearnhub.module.Java_Module1::class.java)
            startActivity(intent)
        }


    }
}