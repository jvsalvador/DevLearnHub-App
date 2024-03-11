import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.Choices_Activity
import com.example.devlearnhub.Register_Activity
import com.example.devlearnhub.api.AuthService
import com.example.devlearnhub.data.LoginRequest
import com.example.devlearnhub.data.ApiResponse
import com.example.devlearnhub.databinding.LayoutLoginActivityBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Login_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutLoginActivityBinding
    private val BASE_URL = "https://campushive-com.preview-domain.com/public/api/"
    private val authService = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(AuthService::class.java)
    private val TAG:String = "Login-Response"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutLoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.tvLoginSignUp.setOnClickListener {
            startActivity(Intent(this, Register_Activity::class.java))
        }

        binding.tvLearnGuest.setOnClickListener {
            startActivity(Intent(this, Choices_Activity::class.java))
        }

        binding.btLoginLogin.setOnClickListener {
            val email = binding.etLoginNumberOrEmail.text.toString().trim()
            val password = binding.etLoginPassword.text.toString().trim()

            if (email.isNotEmpty() && password.isNotEmpty()){
                loginUser(email, password)
            }else {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            }
        }


    }

    private fun loginUser(email: String, password: String) {
        val request = LoginRequest(email, password)
        authService.login(request).enqueue(object : Callback<ApiResponse>{
            override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                if (response.isSuccessful){
                    val intent = Intent(this@Login_Activity, Choices_Activity::class.java)
                    startActivity(intent)
                    finish()
                    Log.d(TAG, "Login successful")
                }else{
                    Toast.makeText(
                        this@Login_Activity,
                        "Sign-in failed: ${response.code()}",
                        Toast.LENGTH_SHORT
                    ).show()
                    Log.e(TAG, "Login failed: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                Toast.makeText(
                    this@Login_Activity,
                    "Sign-in failed: ${t.message}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
}
