package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.JavaModule22Binding

class Java_Module2_2 : AppCompatActivity() {
    private lateinit var binding: JavaModule22Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule22Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext14.setOnClickListener {
            val intent = Intent(this, Java_Module2_3::class.java)
            startActivity(intent)
        }
    }
}