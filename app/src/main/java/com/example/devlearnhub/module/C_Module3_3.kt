package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CModule33Binding

class C_Module3_3 : AppCompatActivity() {
    private lateinit var binding: CModule33Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CModule33Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.cTapToNext5.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, C_Module3_4::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}