package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.SwiftModule14Binding

class Swift_Module1_4 : AppCompatActivity() {
    private lateinit var binding: SwiftModule14Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SwiftModule14Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.swiftTapToNext7.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Swift_Module1_5::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}