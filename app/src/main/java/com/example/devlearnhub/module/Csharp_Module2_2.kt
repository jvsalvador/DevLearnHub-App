package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.CsharpModule22Binding

class Csharp_Module2_2 : AppCompatActivity() {
    private lateinit var binding: CsharpModule22Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CsharpModule22Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.csharpTapToNext7.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Csharp_Module2_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}