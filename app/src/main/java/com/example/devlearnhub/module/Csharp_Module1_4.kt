package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.CsharpModule13Binding
import com.example.devlearnhub.databinding.CsharpModule14Binding
import com.example.devlearnhub.module_activity.CsharpActivity

class Csharp_Module1_4 : AppCompatActivity() {
    private lateinit var binding: CsharpModule14Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CsharpModule14Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.csharpTapToNext6.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, CsharpActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}