package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.JsModule42Binding

class Js_Module4_2 : AppCompatActivity() {
    private lateinit var binding: JsModule42Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JsModule42Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.jsTapToNextt4.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Js_Module4_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}