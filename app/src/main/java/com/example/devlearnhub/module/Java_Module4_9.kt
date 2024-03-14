package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.module_activity.JavaActivity
import com.example.devlearnhub.databinding.JavaModule49Binding

class Java_Module4_9 : AppCompatActivity() {
    private lateinit var binding: JavaModule49Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = JavaModule49Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNext28.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, JavaActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}