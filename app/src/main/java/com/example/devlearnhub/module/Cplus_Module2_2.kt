package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.CplusModule12Binding
import com.example.devlearnhub.databinding.CplusModule22Binding

class Cplus_Module2_2 : AppCompatActivity() {
    private lateinit var binding: CplusModule22Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CplusModule22Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cplusTapToNext3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Cplus_Module2_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}