package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.PythonModule41Binding
import com.example.devlearnhub.module_activity.PythonActivity

class Python_Module4_1 : AppCompatActivity() {
    private lateinit var binding: PythonModule41Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule41Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, PythonActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnTapToNexttt.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Python_Module4_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}