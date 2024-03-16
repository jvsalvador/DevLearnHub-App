package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JsModule41Binding
import com.example.devlearnhub.module_activity.JavascriptActivity

class Js_Module4_1 : AppCompatActivity() {
    private lateinit var binding: JsModule41Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JsModule41Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jsBack4.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, JavascriptActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.jsTapToNext4.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Js_Module4_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}