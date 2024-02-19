package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.PythonModule22Binding

class Python_Module2_2 : AppCompatActivity() {
    private lateinit var binding: PythonModule22Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule22Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext4.setOnClickListener {
            val intent = Intent(this, Python_Module2_3::class.java)
            startActivity(intent)
        }
    }
}