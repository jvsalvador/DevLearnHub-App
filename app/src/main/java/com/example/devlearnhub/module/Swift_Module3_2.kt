package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.SwiftModule32Binding

class Swift_Module3_2 : AppCompatActivity() {
    private lateinit var binding: SwiftModule32Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SwiftModule32Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.swiftTapToNext12.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Swift_Module3_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}