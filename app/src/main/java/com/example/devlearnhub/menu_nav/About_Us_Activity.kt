package com.example.devlearnhub.menu_nav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.Initial_Activity
import com.example.devlearnhub.Junior_Activity
import com.example.devlearnhub.R
import com.example.devlearnhub.Senior_Activity
import com.example.devlearnhub.Sophomore_Activity
import com.example.devlearnhub.databinding.LayoutAboutUsActivityBinding

class About_Us_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutAboutUsActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutAboutUsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToNav.setOnClickListener {
            val intent = Intent(this, Initial_Activity::class.java)
            startActivity(intent)
        }

        binding.btnBackToNav.setOnClickListener {
            val intent = Intent(this, Sophomore_Activity::class.java)
            startActivity(intent)
        }

        binding.btnBackToNav.setOnClickListener {
            val intent = Intent(this, Junior_Activity::class.java)
            startActivity(intent)
        }

        binding.btnBackToNav.setOnClickListener {
            val intent = Intent(this, Senior_Activity::class.java)
            startActivity(intent)
        }
    }
}