package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.JsModule23Binding
import com.example.devlearnhub.module_activity.JavascriptActivity

class Js_Module2_3 : AppCompatActivity() {
    private lateinit var binding: JsModule23Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JsModule23Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jsTapToNextt3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, JavascriptActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}