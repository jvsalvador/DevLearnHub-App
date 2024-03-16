package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.KotlinModule32Binding
import com.example.devlearnhub.databinding.KotlinModule33Binding
import com.example.devlearnhub.module_activity.KotlinActivity

class Kotlin_Module3_3 : AppCompatActivity() {
    private lateinit var binding: KotlinModule33Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = KotlinModule33Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kotlinTapToNext10.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, KotlinActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}