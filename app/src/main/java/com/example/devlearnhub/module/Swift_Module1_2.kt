package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.SwiftModule12Binding

class Swift_Module1_2 : AppCompatActivity() {
    private lateinit var binding: SwiftModule12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SwiftModule12Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.swiftTapToNext5.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Swift_Module1_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}