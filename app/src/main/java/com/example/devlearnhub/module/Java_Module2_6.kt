package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.Java_Activity
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.JavaModule26Binding

class Java_Module2_6 : AppCompatActivity() {
    private lateinit var binding: JavaModule26Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule26Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext8.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}