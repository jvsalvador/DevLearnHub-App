package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CsharpModule21Binding
import com.example.devlearnhub.module_activity.CsharpActivity

class Csharp_Module2_1 : AppCompatActivity() {
    private lateinit var binding: CsharpModule21Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CsharpModule21Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.csharpBack2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, CsharpActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.csharpTapToNext2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Csharp_Module2_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}