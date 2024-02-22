package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.PythonModule14Binding

class Python_Module1_4 : AppCompatActivity() {
    private lateinit var binding: PythonModule14Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule14Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTopToNext4.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Python_Module1_5::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}