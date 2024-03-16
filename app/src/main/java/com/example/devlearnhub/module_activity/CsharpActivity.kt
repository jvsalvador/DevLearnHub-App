package com.example.devlearnhub.module_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.JuniorActivity
import com.example.devlearnhub.databinding.LayoutCsharpActivityBinding
import com.example.devlearnhub.module.Csharp_Module1
import com.example.devlearnhub.module.Csharp_Module2_1
import com.example.devlearnhub.module.Csharp_Module3_1

class CsharpActivity : AppCompatActivity() {
    private lateinit var binding: LayoutCsharpActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutCsharpActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToHome.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, JuniorActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Csharp_Module1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Csharp_Module2_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Csharp_Module3_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}