package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CModule34Binding

class C_Module3_4 : AppCompatActivity() {
    private lateinit var binding: CModule34Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CModule34Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.cTapToNext6.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, C_Module3_5::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}