package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JavaModule55Binding

class Java_Module5_5 : AppCompatActivity() {
    private lateinit var binding: JavaModule55Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule55Binding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnTapToNext33.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module5_6::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}