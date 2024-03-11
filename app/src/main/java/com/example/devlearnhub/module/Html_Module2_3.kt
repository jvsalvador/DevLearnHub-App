package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.HtmlModule23Binding
import com.example.devlearnhub.module_activity.Html_Activity

class Html_Module2_3 : AppCompatActivity() {
    private lateinit var binding: HtmlModule23Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HtmlModule23Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.htmlTapToNext8.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Html_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}