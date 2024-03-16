package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.JsModule32Binding

class Js_Module3_2 : AppCompatActivity() {
    private lateinit var binding: JsModule32Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JsModule32Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jsTapToNexttt3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Js_Module3_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}