package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.MysqlModule44Binding
import com.example.devlearnhub.module_activity.MysqlActivity

class Mysql_Module4_4 : AppCompatActivity() {
    private lateinit var binding: MysqlModule44Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MysqlModule44Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mysqlTapToNext17.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, MysqlActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}