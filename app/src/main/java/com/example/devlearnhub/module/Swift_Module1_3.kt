package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.SwiftModule13Binding

class Swift_Module1_3 : AppCompatActivity() {
    private lateinit var binding: SwiftModule13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SwiftModule13Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.swiftTapToNext6.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Swift_Module1_4::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}