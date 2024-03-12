package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.module_activity.Html_Activity
import com.example.devlearnhub.databinding.HtmlModule32Binding

class Html_Module3_2 : AppCompatActivity() {
    private lateinit var binding: HtmlModule32Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HtmlModule32Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.htmlTapToNext9.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Html_Module3_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}