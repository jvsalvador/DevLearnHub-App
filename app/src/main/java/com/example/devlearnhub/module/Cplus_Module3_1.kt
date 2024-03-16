package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CplusModule31Binding
import com.example.devlearnhub.module_activity.CplusActivity

class Cplus_Module3_1 : AppCompatActivity() {
    private lateinit var binding: CplusModule31Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CplusModule31Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cplusBack3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, CplusActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.cplusTapToNext6.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Cplus_Module3_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}