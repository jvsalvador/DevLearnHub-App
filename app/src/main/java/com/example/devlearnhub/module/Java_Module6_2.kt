package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.Java_Activity
import com.example.devlearnhub.databinding.JavaModule62Binding

class Java_Module6_2 : AppCompatActivity() {
    private lateinit var binding: JavaModule62Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule62Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext36.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module6_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}