package com.example.devlearnhub.Menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.Initial_Activity
import com.example.devlearnhub.Junior_Activity
import com.example.devlearnhub.Senior_Activity
import com.example.devlearnhub.Sophomore_Activity
import com.example.devlearnhub.databinding.LayoutNetworkingFundamentalsActivityBinding

class Networking_Fundamentals_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutNetworkingFundamentalsActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutNetworkingFundamentalsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnBack = binding.btnBack2

        btnBack.setOnClickListener {
            val intent = Intent(this, Initial_Activity::class.java)
            startActivity(intent)

        }

        btnBack.setOnClickListener {
            val intent = Intent(this, Sophomore_Activity::class.java)
            startActivity(intent)

        }

        btnBack.setOnClickListener {
            val intent = Intent(this, Junior_Activity::class.java)
            startActivity(intent)

        }

        btnBack.setOnClickListener {
            val intent = Intent(this, Senior_Activity::class.java)
            startActivity(intent)

        }
    }
}