package com.example.devlearnhub.module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.PythonModule15Binding

class Python_Module1_5 : AppCompatActivity() {
    private lateinit var binding: PythonModule15Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule15Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}