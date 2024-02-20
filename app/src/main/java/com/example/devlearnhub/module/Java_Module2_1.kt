package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.Java_Activity
import com.example.devlearnhub.databinding.JavaModule21Binding

class Java_Module2_1 : AppCompatActivity() {
    private lateinit var binding: JavaModule21Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule21Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackk.setOnClickListener {
            val intent = Intent(this, Java_Activity::class.java)
            startActivity(intent)
        }

        binding.btnTapToNext15.setOnClickListener {
            val intent = Intent(this, Java_Module2_2::class.java)
            startActivity(intent)
        }
    }
}