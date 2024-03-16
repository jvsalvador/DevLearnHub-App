package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.MysqlModule24Binding

class Mysql_Module2_4 : AppCompatActivity() {
    private lateinit var binding: MysqlModule24Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MysqlModule24Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mysqlTapToNext8.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module2_5::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}