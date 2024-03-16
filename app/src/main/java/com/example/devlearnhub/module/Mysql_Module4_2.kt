package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.MysqlModule42Binding

class Mysql_Module4_2 : AppCompatActivity() {
    private lateinit var binding: MysqlModule42Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MysqlModule42Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mysqlTapToNext15.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module4_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}