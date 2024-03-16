package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.SwiftModule15Binding
import com.example.devlearnhub.module_activity.SwiftActivity

class Swift_Module1_5 : AppCompatActivity() {
    private lateinit var binding: SwiftModule15Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SwiftModule15Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.swiftTapToNext8.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, SwiftActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}