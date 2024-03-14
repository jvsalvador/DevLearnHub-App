package com.example.devlearnhub.module_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.InitialActivity
import com.example.devlearnhub.databinding.LayoutJavaActivityBinding

class JavaActivity : AppCompatActivity() {
    private lateinit var binding: LayoutJavaActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutJavaActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToHome.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, InitialActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, com.example.devlearnhub.module.Java_Module1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, com.example.devlearnhub.module.Java_Module2_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, com.example.devlearnhub.module.Java_Module3_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn4.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, com.example.devlearnhub.module.Java_Module4_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn5.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, com.example.devlearnhub.module.Java_Module4_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn6.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, com.example.devlearnhub.module.Java_Module4_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }


    }
}