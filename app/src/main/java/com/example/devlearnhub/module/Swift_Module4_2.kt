package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.SwiftModule33Binding
import com.example.devlearnhub.databinding.SwiftModule42Binding
import com.example.devlearnhub.module_activity.SwiftActivity

class Swift_Module4_2 : AppCompatActivity() {
    private lateinit var binding: SwiftModule42Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SwiftModule42Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.swiftTapToNext15.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Swift_Module4_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}