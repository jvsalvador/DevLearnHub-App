package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.JqueryModule32Binding

class Jquery_Module3_2 : AppCompatActivity() {
    private lateinit var binding: JqueryModule32Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JqueryModule32Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jqueryTapToNext28.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Jquery_Module3_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}