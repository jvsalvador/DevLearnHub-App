package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.JavaModule24Binding

class Java_Module2_4 : AppCompatActivity() {
    private lateinit var binding: JavaModule24Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule24Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext13.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module2_5::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}