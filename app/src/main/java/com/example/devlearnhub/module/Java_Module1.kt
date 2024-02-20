package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.devlearnhub.Java_Activity
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.ActivityMainBinding
import com.example.devlearnhub.databinding.JavaModule1Binding

class Java_Module1 : AppCompatActivity() {
    private lateinit var binding: JavaModule1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack1.setOnClickListener {
            val intent = Intent(this, Java_Activity::class.java)
            startActivity(intent)
        }

        binding.btnTapToNext1.setOnClickListener {
            val intent = Intent(this, Java_Module1_2::class.java)
            startActivity(intent)
        }
    }
}