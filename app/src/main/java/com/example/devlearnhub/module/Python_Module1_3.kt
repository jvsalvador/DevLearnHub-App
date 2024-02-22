package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.PythonModule13Binding

class Python_Module1_3 : AppCompatActivity() {
    private lateinit var binding: PythonModule13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule13Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Python_Module1_4::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}