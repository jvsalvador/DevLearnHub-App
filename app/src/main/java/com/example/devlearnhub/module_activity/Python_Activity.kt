package com.example.devlearnhub.module_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.Initial_Activity
import com.example.devlearnhub.databinding.LayoutPythonActivityBinding

class Python_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutPythonActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutPythonActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToHome.setOnClickListener {
            val intent = Intent(this, Initial_Activity::class.java)
            startActivity(intent)
        }

        binding.btnNextLearn.setOnClickListener {
            val intent = Intent(this, com.example.devlearnhub.module.Python_Module1::class.java)
            startActivity(intent)
        }

        binding.btnNextLearn2.setOnClickListener {
            val intent = Intent(this, com.example.devlearnhub.module.Python_Module2_1::class.java)
            startActivity(intent)
        }

        binding.btnNextLearn3.setOnClickListener {
            val intent = Intent(this, com.example.devlearnhub.module.Python_Module3_1::class.java)
            startActivity(intent)
        }

        binding.btnNextLearn4.setOnClickListener {
            val intent = Intent(this, com.example.devlearnhub.module.Python_Module4_1::class.java)
            startActivity(intent)
        }
    }
}