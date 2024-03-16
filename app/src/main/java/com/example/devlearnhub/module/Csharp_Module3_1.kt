package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.CsharpModule24Binding
import com.example.devlearnhub.databinding.CsharpModule31Binding
import com.example.devlearnhub.module_activity.CsharpActivity

class Csharp_Module3_1 : AppCompatActivity() {
    private lateinit var binding: CsharpModule31Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CsharpModule31Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.csharpBack3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, CsharpActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.csharpTapToNext3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Csharp_Module3_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}