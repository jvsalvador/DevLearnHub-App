package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.Html_Activity
import com.example.devlearnhub.databinding.HtmlModule41Binding

class Html_Module4_1 : AppCompatActivity() {
    private lateinit var binding: HtmlModule41Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HtmlModule41Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackHtml4.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Html_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}