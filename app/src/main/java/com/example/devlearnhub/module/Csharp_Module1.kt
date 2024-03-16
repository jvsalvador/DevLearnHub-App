package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CsharpModule1Binding
import com.example.devlearnhub.module_activity.CsharpActivity

class Csharp_Module1 : AppCompatActivity() {
    private lateinit var binding: CsharpModule1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CsharpModule1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.csharpBack1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, CsharpActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.csharpTapToNext1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Csharp_Module1_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}