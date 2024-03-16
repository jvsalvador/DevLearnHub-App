package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.SwiftModule1Binding
import com.example.devlearnhub.module_activity.SwiftActivity

class Swift_Module1 : AppCompatActivity() {
    private lateinit var binding: SwiftModule1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SwiftModule1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.swiftBack1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, SwiftActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.swiftTapToNext1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Swift_Module1_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}