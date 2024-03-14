package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CModule1Binding
import com.example.devlearnhub.module_activity.CActivity

class C_Module1 : AppCompatActivity() {
    private lateinit var binding: CModule1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CModule1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cBack.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, CActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.cTapToNext1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, C_Module1_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}