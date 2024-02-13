package com.example.devlearnhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.android.material.navigation.NavigationView
import kotlinx.coroutines.delay
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Tag
import com.example.devlearnhub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

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

    }
}
