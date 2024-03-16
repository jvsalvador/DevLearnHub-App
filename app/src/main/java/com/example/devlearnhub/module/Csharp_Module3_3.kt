package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.CsharpModule33Binding
import com.example.devlearnhub.module_activity.CsharpActivity

class Csharp_Module3_3 : AppCompatActivity() {
    private lateinit var binding: CsharpModule33Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CsharpModule33Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chsarpTapToNext11.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, CsharpActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}