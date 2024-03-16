package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.MysqlModule42Binding
import com.example.devlearnhub.databinding.MysqlModule43Binding

class Mysql_Module4_3 : AppCompatActivity() {
    private lateinit var binding: MysqlModule43Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MysqlModule43Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mysqlTapToNext16.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module4_4::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}