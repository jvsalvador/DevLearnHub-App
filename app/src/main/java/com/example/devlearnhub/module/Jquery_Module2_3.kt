package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.JqueryModule23Binding
import com.example.devlearnhub.databinding.JqueryModule24Binding

class Jquery_Module2_3 : AppCompatActivity() {
    private lateinit var binding: JqueryModule23Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JqueryModule23Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jqueryTapToNext24.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Jquery_Module2_4::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}