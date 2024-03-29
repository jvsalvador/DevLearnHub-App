package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.PythonModule12Binding

class Python_Module1_2 : AppCompatActivity() {
    private lateinit var binding: PythonModule12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule12Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Python_Module1_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}