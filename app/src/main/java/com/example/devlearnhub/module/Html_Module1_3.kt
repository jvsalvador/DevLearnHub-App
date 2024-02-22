package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.Html_Activity
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.HtmlModule13Binding
import com.example.devlearnhub.databinding.HtmlModule1Binding

class Html_Module1_3 : AppCompatActivity() {
    private lateinit var binding: HtmlModule13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HtmlModule13Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.htmlTapToNext3.setOnClickListener {
            val intent = Intent(this, Html_Activity::class.java)
            startActivity(intent)
        }
    }
}