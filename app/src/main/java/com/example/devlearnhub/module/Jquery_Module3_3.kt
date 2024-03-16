package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.databinding.JqueryModule33Binding
import com.example.devlearnhub.module_activity.JqueryActivity

class Jquery_Module3_3 : AppCompatActivity() {
    private lateinit var binding: JqueryModule33Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JqueryModule33Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jqueryTapToNext29.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, JqueryActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}