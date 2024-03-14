package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CModule21Binding
import com.example.devlearnhub.module_activity.CActivity

class C_Module2_1 : AppCompatActivity() {
    private lateinit var binding: CModule21Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CModule21Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cBack2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, CActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.cTapToNext2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, C_Module2_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}