package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CModule14Binding
import com.example.devlearnhub.module_activity.C_Activity

class C_Module1_4 : AppCompatActivity() {
    private lateinit var binding: CModule14Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CModule14Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cmoduleTapToNext7.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, C_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}