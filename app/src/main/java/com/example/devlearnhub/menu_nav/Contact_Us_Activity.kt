package com.example.devlearnhub.menu_nav

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.devlearnhub.Initial_Activity
import com.example.devlearnhub.Junior_Activity
import com.example.devlearnhub.R
import com.example.devlearnhub.Senior_Activity
import com.example.devlearnhub.Sophomore_Activity
import com.example.devlearnhub.databinding.LayoutContactUsActivityBinding

class Contact_Us_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutContactUsActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutContactUsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnBack = binding.btnBackToNav2

        btnBack.setOnClickListener {
            // Determine which activity to go back to based on extra information
            val email = intent.getStringExtra("user_email")
            val sourceActivity = intent.getStringExtra("sourceActivity")
            intent.putExtra("user_email", email)
            val intent = when (sourceActivity) {
                "Initial_Activity" -> Intent(this, Initial_Activity::class.java)
                "Sophomore_Activity" -> Intent(this, Sophomore_Activity::class.java)
                "Junior_Activity" -> Intent(this, Junior_Activity::class.java)
                "Senior_Activity" -> Intent(this, Senior_Activity::class.java)
                else -> Intent(this, Initial_Activity::class.java)
            }
            startActivity(intent)
        }

        binding.apply {
            btnSend.setOnClickListener {
                val firstName = etRegisterFirstname.text.toString()
                val lastName = etRegisterLastname.text.toString()
                val email = etRegisterEmail.text.toString()
                val message = etRegisterMessage.text.toString()

                if (firstName.isNotEmpty()&& lastName.isNotEmpty()&& email.isNotEmpty()&& message.isNotEmpty()){
                    val messageBody = "Name: $firstName $lastName\nEmail: $email\nMessage: $message"
                    sendMessage(messageBody)
                }else{
                    Toast.makeText(this@Contact_Us_Activity, "Please fill out all fields", Toast.LENGTH_SHORT).show()
                }

            }
        }
    }
    private fun sendMessage(message: String){
        val intent = Intent(Intent.ACTION_SEND).apply {
            data = Uri.parse("mailto:jeanreyvincents@gmail.com")
            putExtra(Intent.EXTRA_SUBJECT, "Message from DevLearn Hub")
            putExtra(Intent.EXTRA_TEXT, message)
        }
        if (intent.resolveActivity(packageManager) != null){
            startActivity(intent)
        }
    }
}