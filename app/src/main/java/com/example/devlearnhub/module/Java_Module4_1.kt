package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.JavaModule41Binding

class Java_Module4_1 : AppCompatActivity() {
    private lateinit var binding: JavaModule41Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule41Binding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}