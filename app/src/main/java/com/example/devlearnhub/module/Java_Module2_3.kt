package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.JavaModule23Binding

class Java_Module2_3 : AppCompatActivity() {
    private lateinit var binding: JavaModule23Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule23Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapNext5.setOnClickListener {
            val intent = Intent(this, Java_Module2_4::class.java)
            startActivity(intent)
        }
    }
}