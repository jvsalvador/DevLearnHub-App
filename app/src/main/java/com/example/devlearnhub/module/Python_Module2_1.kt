package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.Python_Activity
import com.example.devlearnhub.R
import com.example.devlearnhub.databinding.PythonModule21Binding

class Python_Module2_1 : AppCompatActivity() {
    private lateinit var binding: PythonModule21Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PythonModule21Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack1.setOnClickListener {
            val intent = Intent(this, Python_Activity::class.java)
            startActivity(intent)
        }

        binding.btnTapToNext1.setOnClickListener {
            val intent = Intent(this, Python_Module2_2::class.java)
            startActivity(intent)
        }
    }
}