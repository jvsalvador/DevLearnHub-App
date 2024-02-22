package com.example.devlearnhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.LayoutHtmlActivityBinding
import com.example.devlearnhub.module.Html_Module1
import com.example.devlearnhub.module.Html_Module2_1
import com.example.devlearnhub.module.Html_Module3_1
import com.example.devlearnhub.module.Html_Module4_1
import com.example.devlearnhub.module.Java_Module1
import com.example.devlearnhub.module.Java_Module2_1
import com.example.devlearnhub.module.Java_Module3_1
import com.example.devlearnhub.module.Java_Module4_1

class Html_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutHtmlActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutHtmlActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToHome.setOnClickListener {
            val intent = Intent(this, Initial_Activity::class.java)
            startActivity(intent)
        }

        binding.btnNextLearn.setOnClickListener {
            val intent = Intent(this, Html_Module1::class.java)
            startActivity(intent)
        }

        binding.btnNextLearn2.setOnClickListener {
            val intent = Intent(this, Html_Module2_1::class.java)
            startActivity(intent)
        }

        binding.btnNextLearn3.setOnClickListener {
            val intent = Intent(this, Html_Module3_1::class.java)
            startActivity(intent)
        }

        binding.btnNextLearn4.setOnClickListener {
            val intent = Intent(this, Html_Module4_1::class.java)
            startActivity(intent)
        }
    }
}