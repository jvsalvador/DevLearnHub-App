package com.example.devlearnhub.module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlearnhub.databinding.CModule24Binding
import com.example.devlearnhub.module_activity.C_Activity

class C_Module2_4 : AppCompatActivity() {
    private lateinit var binding: CModule24Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CModule24Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cmoduleTapToNext2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, C_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}