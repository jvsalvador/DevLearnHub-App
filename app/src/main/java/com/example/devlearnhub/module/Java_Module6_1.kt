package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.module_activity.Java_Activity
import com.example.devlearnhub.databinding.JavaModule61Binding

class Java_Module6_1 : AppCompatActivity() {
    private lateinit var binding: JavaModule61Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule61Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackJava2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnTapToNext35.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module6_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}