package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JavaModule51Binding
import com.example.devlearnhub.databinding.JavaModule52Binding

class Java_Module5_2 : AppCompatActivity() {
    private lateinit var binding: JavaModule52Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule52Binding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnTapToNext30.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module5_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}