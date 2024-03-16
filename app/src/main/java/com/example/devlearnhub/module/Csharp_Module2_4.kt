package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.CsharpModule24Binding
import com.example.devlearnhub.module_activity.CsharpActivity

class Csharp_Module2_4 : AppCompatActivity() {
    private lateinit var binding: CsharpModule24Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CsharpModule24Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.csharpTapToNext9.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, CsharpActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}