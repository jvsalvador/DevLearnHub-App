package com.example.devlearnhub.menu_nav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.Initial_Activity
import com.example.devlearnhub.Junior_Activity
import com.example.devlearnhub.Senior_Activity
import com.example.devlearnhub.Sophomore_Activity
import com.example.devlearnhub.databinding.LayoutNetworkingFundamentalsActivityBinding

class Networking_Fundamentals_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutNetworkingFundamentalsActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutNetworkingFundamentalsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnBack = binding.btnBack2

        btnBack.setOnClickListener {
            // Determine which activity to go back to based on extra information
            val email = intent.getStringExtra("user_email")
            val sourceActivity = intent.getStringExtra("sourceActivity")
            intent.putExtra("user_email", email)
            val intent = when (sourceActivity) {
                "Initial_Activity" -> Intent(this, Initial_Activity::class.java)
                "Sophomore_Activity" -> Intent(this, Sophomore_Activity::class.java)
                "Junior_Activity" -> Intent(this, Junior_Activity::class.java)
                "Senior_Activity" -> Intent(this, Senior_Activity::class.java)
                else -> Intent(this, Initial_Activity::class.java)
            }
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val sourceActivity = this::class.java.simpleName
        val intent = Intent(this, Networking_Fundamentals_Activity::class.java)
        intent.putExtra("sourceActivity", sourceActivity)
        startActivity(intent)
    }
}