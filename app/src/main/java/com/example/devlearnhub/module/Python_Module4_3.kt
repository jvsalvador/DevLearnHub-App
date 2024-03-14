package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.PythonModule43Binding
import com.example.devlearnhub.module_activity.PythonActivity

class Python_Module4_3 : AppCompatActivity() {
    private lateinit var binding: PythonModule43Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule43Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNexttt3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, PythonActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}