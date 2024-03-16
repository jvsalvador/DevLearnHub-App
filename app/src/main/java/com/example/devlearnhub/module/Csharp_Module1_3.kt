package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.CsharpModule13Binding

class Csharp_Module1_3 : AppCompatActivity() {
    private lateinit var binding: CsharpModule13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CsharpModule13Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.csharpTapToNext5.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Csharp_Module1_4::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}