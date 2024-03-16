package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.JqueryModule21Binding
import com.example.devlearnhub.module_activity.JqueryActivity

class Jquery_Module2_1 : AppCompatActivity() {
    private lateinit var binding: JqueryModule21Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JqueryModule21Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jqBack2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, JqueryActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.jqueryTapToNext2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Jquery_Module2_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}