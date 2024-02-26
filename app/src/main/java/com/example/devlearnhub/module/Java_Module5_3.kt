package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JavaModule53Binding

class Java_Module5_3 : AppCompatActivity() {
    private lateinit var binding: JavaModule53Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule53Binding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnTapToNext31.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module5_4::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}