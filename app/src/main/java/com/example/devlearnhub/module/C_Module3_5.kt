package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CModule35Binding
import com.example.devlearnhub.module_activity.CActivity

class C_Module3_5 : AppCompatActivity() {
    private lateinit var binding: CModule35Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CModule35Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.cTapToNext7.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, CActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}