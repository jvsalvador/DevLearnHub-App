package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.JsModule22Binding

class Js_Module2_2 : AppCompatActivity() {
    private lateinit var binding: JsModule22Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JsModule22Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jsTapToTextt1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Js_Module2_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}