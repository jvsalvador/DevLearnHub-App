package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.MysqlModule13Binding

class Mysql_Module1_3 : AppCompatActivity() {
    private lateinit var binding: MysqlModule13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MysqlModule13Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.msqlTapToNext3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module1_4::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}