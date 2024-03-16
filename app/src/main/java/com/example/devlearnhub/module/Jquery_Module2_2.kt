package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.JqueryModule22Binding

class Jquery_Module2_2 : AppCompatActivity() {
    private lateinit var binding: JqueryModule22Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JqueryModule22Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jqueryTapToNext23.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Jquery_Module2_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}