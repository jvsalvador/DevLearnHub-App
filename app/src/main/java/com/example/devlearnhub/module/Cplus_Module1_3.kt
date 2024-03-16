package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.CplusModule13Binding
import com.example.devlearnhub.module_activity.CplusActivity

class Cplus_Module1_3 : AppCompatActivity() {
    private lateinit var binding: CplusModule13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CplusModule13Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cplusTapToNext12.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, CplusActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}