package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.HtmlModule23Binding
import com.example.devlearnhub.module_activity.HtmlActivity

class Html_Module2_3 : AppCompatActivity() {
    private lateinit var binding: HtmlModule23Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HtmlModule23Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.htmlTapToNext8.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, HtmlActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}