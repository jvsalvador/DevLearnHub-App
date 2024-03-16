package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.MysqlModule23Binding

class Mysql_Module2_3 : AppCompatActivity() {
    private lateinit var binding: MysqlModule23Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MysqlModule23Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mysqlTapToNext7.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module2_4::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}