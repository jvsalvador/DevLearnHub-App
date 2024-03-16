package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JqueryModule31Binding
import com.example.devlearnhub.module_activity.JqueryActivity

class Jquery_Module3_1 : AppCompatActivity() {
    private lateinit var binding: JqueryModule31Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JqueryModule31Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jqBack3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, JqueryActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.jqueryTapToNext26.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Jquery_Module3_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}