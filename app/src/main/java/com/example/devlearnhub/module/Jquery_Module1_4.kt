package com.example.devlearnhub.module

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.JqueryModule14Binding
import com.example.devlearnhub.module_activity.JqueryActivity

class Jquery_Module1_4 : AppCompatActivity() {
    private lateinit var binding: JqueryModule14Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JqueryModule14Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jqueryTapToNext22.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, JqueryActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}