package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.module_activity.Java_Activity
import com.example.devlearnhub.databinding.JavaModule21Binding

class Java_Module2_1 : AppCompatActivity() {
    private lateinit var binding: JavaModule21Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule21Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackk.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnTapToNext15.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Module2_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}