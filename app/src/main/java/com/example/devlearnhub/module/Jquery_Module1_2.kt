package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.JqueryModule12Binding

class Jquery_Module1_2 : AppCompatActivity() {
    private lateinit var binding: JqueryModule12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JqueryModule12Binding.inflate(layoutInflater)
        setContentView(R.layout.jquery_module1)

        binding.jqTapToNext1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Jquery_Module1_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}