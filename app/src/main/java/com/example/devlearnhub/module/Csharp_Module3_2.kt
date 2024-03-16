package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.CsharpModule31Binding
import com.example.devlearnhub.databinding.CsharpModule32Binding
import com.example.devlearnhub.module_activity.CsharpActivity

class Csharp_Module3_2 : AppCompatActivity() {
    private lateinit var binding: CsharpModule32Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CsharpModule32Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.csharpTapToNext10.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Csharp_Module3_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}