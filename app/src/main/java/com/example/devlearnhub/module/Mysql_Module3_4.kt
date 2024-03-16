package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.MysqlModule34Binding

class Mysql_Module3_4 : AppCompatActivity() {
    private lateinit var binding: MysqlModule34Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MysqlModule34Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mysqlTapToNext12.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module3_5::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}