package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CModule22Binding

class C_Module2_2 : AppCompatActivity() {
    private lateinit var binding: CModule22Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CModule22Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cmoduleTapToNext3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, C_Module2_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}