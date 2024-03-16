package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.MysqlModule15Binding
import com.example.devlearnhub.module_activity.MysqlActivity

class Mysql_Module1_5 : AppCompatActivity() {
    private lateinit var binding: MysqlModule15Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MysqlModule15Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.msqlTapToNnext6.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, MysqlActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}