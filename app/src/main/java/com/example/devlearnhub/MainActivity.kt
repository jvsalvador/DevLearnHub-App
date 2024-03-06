package com.example.devlearnhub

import Login_Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.devlearnhub.data.DatabaseHelper
import com.example.devlearnhub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(2000)
        installSplashScreen()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val delayMillis = 2000L
        val intent = Intent(this, Login_Activity::class.java)

        android.os.Handler().postDelayed({
            startActivity(intent)
            finish()
        }, delayMillis)

        databaseHelper = DatabaseHelper(this)


    }
}
