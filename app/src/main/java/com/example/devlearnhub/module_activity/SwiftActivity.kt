package com.example.devlearnhub.module_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.LayoutSwiftActivtyBinding
import com.example.devlearnhub.module.Swift_Module1
import com.example.devlearnhub.module.Swift_Module3_1
import com.example.devlearnhub.module.Swift_Module4_1
import com.example.devlearnhub.module.swift_Module2_1

class SwiftActivity : AppCompatActivity() {
    private lateinit var binding: LayoutSwiftActivtyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutSwiftActivtyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNextLearn.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Swift_Module1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, swift_Module2_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Swift_Module3_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn4.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Swift_Module4_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}