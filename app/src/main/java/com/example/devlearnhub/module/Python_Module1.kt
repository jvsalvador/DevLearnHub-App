package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.PythonModule1Binding
import com.example.devlearnhub.module_activity.Python_Activity

class Python_Module1 : AppCompatActivity() {
    private lateinit var binding: PythonModule1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackPythonChoices.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Python_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnTapToNext.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Python_Module1_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}