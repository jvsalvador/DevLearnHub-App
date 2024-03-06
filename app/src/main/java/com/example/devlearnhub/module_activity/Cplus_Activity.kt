package com.example.devlearnhub.module_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.LayoutCplusActivityBinding
import com.example.devlearnhub.module.Cplus_Module1
import com.example.devlearnhub.module.Cplus_Module2_1
import com.example.devlearnhub.module.Cplus_Module3_1

class Cplus_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutCplusActivityBinding
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutCplusActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.btnNextLearn.setOnClickListener {
                val email = intent.getStringExtra("user_email")
                val intent = Intent(this, Cplus_Module1::class.java)
                intent.putExtra("user_email", email)
                startActivity(intent)
            }

            binding.btnNextLearn2.setOnClickListener {
                val email = intent.getStringExtra("user_email")
                val intent = Intent(this, Cplus_Module2_1::class.java)
                intent.putExtra("user_email", email)
                startActivity(intent)
            }

            binding.btnNextLearn3.setOnClickListener {
                val email = intent.getStringExtra("user_email")
                val intent = Intent(this, Cplus_Module3_1::class.java)
                intent.putExtra("user_email", email)
                startActivity(intent)
            }


        }
}