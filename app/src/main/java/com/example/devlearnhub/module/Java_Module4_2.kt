package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JavaModule42Binding

class Java_Module4_2 : AppCompatActivity() {
    private lateinit var binding: JavaModule42Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule42Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext21.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module4_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}