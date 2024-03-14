package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.module_activity.HtmlActivity
import com.example.devlearnhub.databinding.HtmlModule33Binding

class Html_Module3_3 : AppCompatActivity() {
    private lateinit var binding: HtmlModule33Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HtmlModule33Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.htmlTapToNext10.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, HtmlActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}