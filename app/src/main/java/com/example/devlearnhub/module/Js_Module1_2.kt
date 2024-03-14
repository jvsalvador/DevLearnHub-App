package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JsModule12Binding

class Js_Module1_2 : AppCompatActivity() {
    private lateinit var binding: JsModule12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JsModule12Binding.inflate(layoutInflater)
        setContentView(binding.root)


        //binding.jsTapToNext1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Js_Module1_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
