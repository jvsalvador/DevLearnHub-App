package com.example.devlearnhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.devlearnhub.databinding.LayoutChoicesActivityBinding

class ChoicesActivity : AppCompatActivity() {

    private lateinit var binding: LayoutChoicesActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutChoicesActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnNext = binding.btnNext
        val cbFirst = binding.cbFirst
        val cbSecond = binding.cbSecond
        val cbThird = binding.cbThird
        val cbFourth = binding.cbFourth

        val checkBoxes = listOf(cbFirst, cbSecond, cbThird, cbFourth)
        checkBoxes.forEach { checkBox ->
            checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked)
                    checkBoxes.filter { it != buttonView }.forEach { it.isChecked = false }
            }
        }

        btnNext.setOnClickListener {
            val selectedCheckBox = checkBoxes.find { it.isChecked }

            if (selectedCheckBox != null) {
                val email = intent.getStringExtra("user_email")
                val intent = when (selectedCheckBox) {
                    cbFirst -> Intent(this, InitialActivity::class.java)
                    cbSecond -> Intent(this, SophomoreActivity::class.java)
                    cbThird -> Intent(this, JuniorActivity::class.java)
                    cbFourth -> Intent(this, SeniorActivity::class.java)
                    else -> null
                }

                if (intent != null) {
                    intent.putExtra("user_email", email)
                    startActivity(intent)
                }
            } else {
                Toast.makeText(this, "Please select a year", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
