package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.PythonModule41Binding
import com.example.devlearnhub.databinding.PythonModule42Binding
import com.example.devlearnhub.module_activity.Python_Activity

class Python_Module4_2 : AppCompatActivity() {
    private lateinit var binding: PythonModule42Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule42Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTapToNexttt2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Python_Module4_3::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}