package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CModule31Binding
import com.example.devlearnhub.module_activity.CActivity

class C_Module3_1 : AppCompatActivity() {
    private lateinit var binding: CModule31Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CModule31Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cBack3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, CActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.cTapToNext3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, C_Module3_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}