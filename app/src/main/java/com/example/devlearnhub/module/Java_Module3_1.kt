package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.JavaModule31Binding

class Java_Module3_1 : AppCompatActivity() {
    private lateinit var binding: JavaModule31Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule31Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext9.setOnClickListener {
            val intent = Intent(this, Java_Module3_2::class.java)
            startActivity(intent)
        }
    }
}