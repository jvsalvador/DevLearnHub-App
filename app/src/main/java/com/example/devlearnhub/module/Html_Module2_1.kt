package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.module_activity.Html_Activity
import com.example.devlearnhub.databinding.HtmlModule21Binding

class Html_Module2_1 : AppCompatActivity() {
    private lateinit var binding: HtmlModule21Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HtmlModule21Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackHtml2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Html_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.htmlTapToNext4.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Html_Module2_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}