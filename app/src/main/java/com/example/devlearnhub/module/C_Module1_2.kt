package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CModule12Binding

class C_Module1_2 : AppCompatActivity() {
    private lateinit var binding: CModule12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CModule12Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cmoduleTapToNext5.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, C_Module1_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}