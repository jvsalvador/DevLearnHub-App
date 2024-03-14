package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JsModule1Binding
import com.example.devlearnhub.module_activity.JavascriptActivity

class Js_Module1 : AppCompatActivity() {
    private lateinit var binding: JsModule1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JsModule1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jsBack.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, JavascriptActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.jsTapToNext1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Js_Module1_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}