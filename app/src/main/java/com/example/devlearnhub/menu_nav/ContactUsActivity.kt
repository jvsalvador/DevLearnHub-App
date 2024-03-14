package com.example.devlearnhub.menu_nav

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.devlearnhub.InitialActivity
import com.example.devlearnhub.JuniorActivity
import com.example.devlearnhub.SeniorActivity
import com.example.devlearnhub.SophomoreActivity
import com.example.devlearnhub.databinding.LayoutContactUsActivityBinding

class ContactUsActivity : AppCompatActivity() {
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
                "Initial_Activity" -> Intent(this, InitialActivity::class.java)
                "Sophomore_Activity" -> Intent(this, SophomoreActivity::class.java)
                "Junior_Activity" -> Intent(this, JuniorActivity::class.java)
                "Senior_Activity" -> Intent(this, SeniorActivity::class.java)
                else -> Intent(this, InitialActivity::class.java)
            }
            startActivity(intent)
        }

        binding.apply {
            btnSend.setOnClickListener {
                val name = etContactName.text.toString()
                val email = etContactEmail.text.toString()
                val message = etContactMessage.text.toString()

                if (name.isNotEmpty()&&  email.isNotEmpty()&& message.isNotEmpty()){
                    val messageBody = "Name: $name \nEmail: $email\nMessage: $message"
                    sendMessage(messageBody)
                }else{
                    Toast.makeText(this@ContactUsActivity, "Please fill out all fields", Toast.LENGTH_SHORT).show()
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