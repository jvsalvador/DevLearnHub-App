package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.PythonModule24Binding

class Python_Module2_4 : AppCompatActivity() {
    private lateinit var binding: PythonModule24Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule24Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext6.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Python_Module2_5::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}