package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.JsModule43Binding
import com.example.devlearnhub.module_activity.JavascriptActivity

class Js_Module4_3: AppCompatActivity() {
    private lateinit var binding: JsModule43Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JsModule43Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.jsTapToNextt5.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, JavascriptActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}