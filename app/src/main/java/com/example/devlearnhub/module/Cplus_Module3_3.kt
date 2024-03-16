package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.CplusModule33Binding
import com.example.devlearnhub.module_activity.CplusActivity

class Cplus_Module3_3 : AppCompatActivity() {
    private lateinit var binding: CplusModule33Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CplusModule33Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cplusTapToNext6.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, CplusActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}