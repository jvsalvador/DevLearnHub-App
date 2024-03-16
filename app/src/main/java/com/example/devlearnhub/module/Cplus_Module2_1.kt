package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CplusModule21Binding
import com.example.devlearnhub.module_activity.CplusActivity

class Cplus_Module2_1 : AppCompatActivity() {
    private lateinit var binding: CplusModule21Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CplusModule21Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cplusBack2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, CplusActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.cplusTapToNext2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Cplus_Module2_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}