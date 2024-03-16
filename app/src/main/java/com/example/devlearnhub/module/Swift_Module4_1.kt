package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.SwiftModule41Binding
import com.example.devlearnhub.module_activity.SwiftActivity

class Swift_Module4_1 : AppCompatActivity() {
    private lateinit var binding: SwiftModule41Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SwiftModule41Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.swiftBack4.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, SwiftActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.swiftTapToNext4.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Swift_Module4_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}