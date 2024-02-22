package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.HtmlModule1Binding

class Html_Module1 : AppCompatActivity() {
    private lateinit var binding: HtmlModule1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HtmlModule1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.htmlTapToNext.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Html_Module1_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}