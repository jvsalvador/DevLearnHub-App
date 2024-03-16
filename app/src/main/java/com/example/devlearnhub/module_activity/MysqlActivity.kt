package com.example.devlearnhub.module_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.SophomoreActivity
import com.example.devlearnhub.databinding.LayoutMysqlActivityBinding
import com.example.devlearnhub.module.Mysql_Module1
import com.example.devlearnhub.module.Mysql_Module2_1
import com.example.devlearnhub.module.Mysql_Module3_1
import com.example.devlearnhub.module.Mysql_Module4_1

class MysqlActivity : AppCompatActivity() {
    private lateinit var binding: LayoutMysqlActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutMysqlActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToHome.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, SophomoreActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module2_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module3_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnNextLearn4.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Module4_1::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}