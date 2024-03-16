package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.MysqlModule22Binding

class Mysql_Module2_2 : AppCompatActivity() {
    private lateinit var binding: MysqlModule22Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MysqlModule22Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mysqlTapToNext6.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module2_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}