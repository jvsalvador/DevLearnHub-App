package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JsModule31Binding
import com.example.devlearnhub.module_activity.JavascriptActivity

class Js_Module3_1 : AppCompatActivity() {
    private lateinit var binding: JsModule31Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JsModule31Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jsBack3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, JavascriptActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.jsTapToNext3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Js_Module3_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}