package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.CplusModule12Binding

class Cplus_Module1_2 : AppCompatActivity() {
    private lateinit var binding: CplusModule12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CplusModule12Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cplusTapToNext2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Cplus_Module1_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}