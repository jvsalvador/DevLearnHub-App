package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.SwiftModule24Binding
import com.example.devlearnhub.module_activity.SwiftActivity

class Swift_Module2_4 : AppCompatActivity() {
    private lateinit var binding: SwiftModule24Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SwiftModule24Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.swiftTapToNext11.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, SwiftActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}