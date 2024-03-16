package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.JqueryModule1Binding
import com.example.devlearnhub.module_activity.JqueryActivity

class Jquery_Module1 : AppCompatActivity() {
    private lateinit var binding: JqueryModule1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JqueryModule1Binding.inflate(layoutInflater)
        setContentView(R.layout.jquery_module1)


        binding.jqueryBack.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, JqueryActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.jqTapToNext.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Jquery_Module1_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}