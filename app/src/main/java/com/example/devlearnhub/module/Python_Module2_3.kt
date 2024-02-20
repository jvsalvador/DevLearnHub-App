package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.PythonModule23Binding

class Python_Module2_3 : AppCompatActivity() {
    private lateinit var binding: PythonModule23Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule23Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext5.setOnClickListener {
            val intent = Intent(this, Python_Module2_4::class.java)
            startActivity(intent)
        }
    }
}