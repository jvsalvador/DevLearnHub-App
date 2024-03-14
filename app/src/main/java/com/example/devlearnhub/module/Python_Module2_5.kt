package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.PythonModule25Binding
import com.example.devlearnhub.module_activity.PythonActivity

class Python_Module2_5 : AppCompatActivity() {
    private lateinit var binding: PythonModule25Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule25Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext7.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, PythonActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}