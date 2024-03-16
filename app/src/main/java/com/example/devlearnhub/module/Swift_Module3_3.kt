package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.SwiftModule33Binding
import com.example.devlearnhub.module_activity.SwiftActivity

class Swift_Module3_3 : AppCompatActivity() {
    private lateinit var binding: SwiftModule33Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SwiftModule33Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.swiftTapToNext13.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, SwiftActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}