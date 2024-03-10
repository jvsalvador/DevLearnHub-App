package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CModule32Binding

class C_Module3_2 : AppCompatActivity() {
    private lateinit var binding: CModule32Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CModule32Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.cTapToNext4.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, C_Module3_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}