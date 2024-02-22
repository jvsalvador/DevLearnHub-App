package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.Python_Activity
import com.example.devlearnhub.databinding.PythonModule33Binding

class Python_Module3_3 : AppCompatActivity() {
    private lateinit var binding: PythonModule33Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule33Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnTapToNextt3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Python_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}