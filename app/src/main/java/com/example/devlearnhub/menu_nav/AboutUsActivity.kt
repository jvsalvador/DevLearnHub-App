package com.example.devlearnhub.menu_nav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.InitialActivity
import com.example.devlearnhub.JuniorActivity
import com.example.devlearnhub.SeniorActivity
import com.example.devlearnhub.SophomoreActivity
import com.example.devlearnhub.databinding.LayoutAboutUsActivityBinding

class AboutUsActivity : AppCompatActivity() {
    private lateinit var binding: LayoutAboutUsActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutAboutUsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnBack = binding.btnBackToNav

        btnBack.setOnClickListener {
            // Determine which activity to go back to based on extra information
            val email = intent.getStringExtra("user_email")
            val sourceActivity = intent.getStringExtra("sourceActivity")
            intent.putExtra("user_email", email)
            val intent = when (sourceActivity) {
                "Initial_Activity" -> Intent(this, InitialActivity::class.java)
                "Sophomore_Activity" -> Intent(this, SophomoreActivity::class.java)
                "Junior_Activity" -> Intent(this, JuniorActivity::class.java)
                "Senior_Activity" -> Intent(this, SeniorActivity::class.java)
                else -> Intent(this, InitialActivity::class.java)
            }
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val sourceActivity = this::class.java.simpleName
        val intent = Intent(this, AboutUsActivity::class.java)
        intent.putExtra("sourceActivity", sourceActivity)
        startActivity(intent)
    }
}