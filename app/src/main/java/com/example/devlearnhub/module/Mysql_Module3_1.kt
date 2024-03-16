package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.MysqlModule31Binding
import com.example.devlearnhub.module_activity.MysqlActivity

class Mysql_Module3_1 : AppCompatActivity() {
    private lateinit var binding: MysqlModule31Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MysqlModule31Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mysqlBack3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, MysqlActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.mysqlTapToNext3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module3_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}