package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.SwiftModule21Binding
import com.example.devlearnhub.module_activity.SwiftActivity

class swift_Module2_1 : AppCompatActivity() {
    private lateinit var binding: SwiftModule21Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SwiftModule21Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.swiftBack2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, SwiftActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.swiftTapToNext2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Swift_Module2_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}