package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.MysqlModule25Binding
import com.example.devlearnhub.module_activity.MysqlActivity

class Mysql_Module2_5 : AppCompatActivity() {
    private lateinit var binding: MysqlModule25Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MysqlModule25Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mysqlTapToNext9.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, MysqlActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}