package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.MysqlModule12Binding

class Mysql_Module1_2 : AppCompatActivity() {
    private lateinit var binding: MysqlModule12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MysqlModule12Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.msqlTapToNext2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module1_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}