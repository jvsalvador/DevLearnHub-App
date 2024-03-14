package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.module_activity.HtmlActivity
import com.example.devlearnhub.databinding.HtmlModule31Binding

class Html_Module3_1 : AppCompatActivity() {
    private lateinit var binding: HtmlModule31Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HtmlModule31Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackHtml3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, HtmlActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.htmlTapToNext5.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Html_Module3_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}