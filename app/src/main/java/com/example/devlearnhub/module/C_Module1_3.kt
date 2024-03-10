package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CModule13Binding

class C_Module1_3 : AppCompatActivity() {
    private lateinit var binding: CModule13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CModule13Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cmoduleTapToNext6.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, C_Module1_4::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}