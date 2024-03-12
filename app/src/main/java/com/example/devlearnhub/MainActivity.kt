package com.example.devlearnhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.devlearnhub.api.UserServices
import com.example.devlearnhub.data.ApiResponse
import com.example.devlearnhub.data.DatabaseHelper
import com.example.devlearnhub.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var databaseHelper: DatabaseHelper
    private val BASE_URL = "https://campushive-com.preview-domain.com/public/api/"
    private val TAG:String = "Check-Response"

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

        getalluser()
    }

    private fun getalluser(){
        val api = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserServices::class.java)

        api.getData().enqueue(object : Callback<ApiResponse> {
            override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                if (response.isSuccessful) {
                    val apiResponse = response.body()
                    val users = apiResponse?.data
                    users?.let { userList ->
                        val myStringBuilder = StringBuilder()
                        for (user in userList) {
                            myStringBuilder.append("ID: ${user.id}\n")
                            myStringBuilder.append("First Name: ${user.firstname}\n")
                            myStringBuilder.append("Last Name: ${user.lastname}\n")
                            myStringBuilder.append("Email: ${user.email}\n")
                        }

                    }
                } else {
                    Log.e(TAG, "Unsuccessful response: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                Log.e(TAG, "onFailure: ${t.message}", t)
            }
        })



    }
}

