package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.MysqlModule14Binding

class Mysql_Module1_4 : AppCompatActivity() {
    private lateinit var binding: MysqlModule14Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MysqlModule14Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.mysqlTapToNext5.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module1_5::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}