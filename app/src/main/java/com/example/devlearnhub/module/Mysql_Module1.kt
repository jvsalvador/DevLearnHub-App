package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.MysqlModule1Binding
import com.example.devlearnhub.module_activity.MysqlActivity

class Mysql_Module1 : AppCompatActivity() {
    private lateinit var binding: MysqlModule1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MysqlModule1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mysqlBack.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, MysqlActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.mysqlTapToNext1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module1_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}