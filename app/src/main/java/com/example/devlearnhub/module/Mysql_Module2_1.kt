package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.MysqlModule21Binding
import com.example.devlearnhub.module_activity.MysqlActivity

class Mysql_Module2_1 : AppCompatActivity() {
    private lateinit var binding: MysqlModule21Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MysqlModule21Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mysqlBack2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, MysqlActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.msqlTapToNext1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module2_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}