package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.module_activity.JavaActivity
import com.example.devlearnhub.databinding.JavaModule15Binding

class Java_Module1_5 : AppCompatActivity() {
    private lateinit var binding: JavaModule15Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule15Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnJavaNext5.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, JavaActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}