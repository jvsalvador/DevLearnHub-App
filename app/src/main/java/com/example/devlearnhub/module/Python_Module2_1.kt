package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.module_activity.PythonActivity
import com.example.devlearnhub.databinding.PythonModule21Binding

class Python_Module2_1 : AppCompatActivity() {
    private lateinit var binding: PythonModule21Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule21Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, PythonActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        binding.btnTapToNext1.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Python_Module2_2::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}