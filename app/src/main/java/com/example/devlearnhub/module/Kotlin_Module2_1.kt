package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.KotlinModule21Binding
import com.example.devlearnhub.module_activity.KotlinActivity

class Kotlin_Module2_1 : AppCompatActivity() {
    private lateinit var binding: KotlinModule21Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = KotlinModule21Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kotlinBack2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, KotlinActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.kotlin2TapToNext1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Kotlin_Module2_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}