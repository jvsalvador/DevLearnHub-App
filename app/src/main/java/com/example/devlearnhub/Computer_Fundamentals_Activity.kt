package com.example.devlearnhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.LayoutComputerFundamentalsActivityBinding
import com.example.devlearnhub.databinding.LayoutInitialActivityBinding

class Computer_Fundamentals_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutComputerFundamentalsActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutComputerFundamentalsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnBack = binding.btnBack

        btnBack.setOnClickListener {
            startActivity(Intent(this, Initial_Activity::class.java))
            startActivity(intent)

        }
    }
}