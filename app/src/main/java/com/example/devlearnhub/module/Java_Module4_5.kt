package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JavaModule45Binding

class Java_Module4_5 : AppCompatActivity() {
    private lateinit var binding: JavaModule45Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule45Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext24.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module4_6::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}