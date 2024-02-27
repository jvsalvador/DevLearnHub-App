package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.module_activity.Python_Activity
import com.example.devlearnhub.databinding.PythonModule15Binding

class Python_Module1_5 : AppCompatActivity() {
    private lateinit var binding: PythonModule15Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule15Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTopToNext5.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Python_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}