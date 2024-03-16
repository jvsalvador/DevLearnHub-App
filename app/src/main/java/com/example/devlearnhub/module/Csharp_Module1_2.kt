package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.CsharpModule12Binding

class Csharp_Module1_2 : AppCompatActivity() {
    private lateinit var binding: CsharpModule12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CsharpModule12Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.csharpTapToNext4.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Csharp_Module1_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}