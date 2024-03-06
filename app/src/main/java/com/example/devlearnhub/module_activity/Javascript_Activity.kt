package com.example.devlearnhub.module_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.LayoutJavascriptActivityBinding
import com.example.devlearnhub.module.Java_Module1
import com.example.devlearnhub.module.Java_Module2_1
import com.example.devlearnhub.module.Js_Module1
import com.example.devlearnhub.module.Js_Module2_1
import com.example.devlearnhub.module.Js_Module3_1
import com.example.devlearnhub.module.Js_Module4_1

class Javascript_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutJavascriptActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutJavascriptActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNextLearn.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Js_Module1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Js_Module2_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Js_Module3_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn4.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Js_Module4_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}