import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.Choices_Activity
import com.example.devlearnhub.data.ApiService
import com.example.devlearnhub.data.DatabaseHelper
import com.example.devlearnhub.data.LoginRequest
import com.example.devlearnhub.data.LoginResponse
import com.example.devlearnhub.data.ValidationUtils
import com.example.devlearnhub.databinding.LayoutLoginActivityBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Login_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutLoginActivityBinding
    private lateinit var db: DatabaseHelper
    private lateinit var apiService: ApiService
    private val BASE_URL = "https://devlearn-com.preview-domain.com/public/api/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutLoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize Retrofit API Service
        apiService = RetrofitClient.getClient(BASE_URL).create(ApiService::class.java)

        binding.tvLoginSignUp.setOnClickListener {
            startActivity(Intent(this, Register_Activity::class.java))
        }

        binding.btLoginLogin.setOnClickListener {
            loginUser()
        }

        binding.tvLearnGuest.setOnClickListener {
            startActivity(Intent(this, Choices_Activity::class.java))
        }
    }

    private fun loginUser() {
        val email = binding.etLoginNumberOrEmail.text.toString().trim()
        val password = binding.etLoginPassword.text.toString().trim()

        if (ValidationUtils.isTextNotEmpty(email) && ValidationUtils.isTextNotEmpty(password)) {
            if (ValidationUtils.isValidEmail(email)) {
                // Create login request
                val loginRequest = LoginRequest(email, password)

                // Make API call for login
                val call = apiService.loginUser(loginRequest)
                call.enqueue(object : Callback<LoginResponse> {
                    override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                        if (response.isSuccessful) {
                            val loginResponse = response.body()
                            // Handle successful login
                            // Pass the email to Choices_Activity
                            val intent = Intent(this@Login_Activity, Choices_Activity::class.java)
                            intent.putExtra("user_email", email)
                            startActivity(intent)
                            finish()
                        } else {
                            // Handle unsuccessful login
                            Toast.makeText(this@Login_Activity, "Invalid email or password", Toast.LENGTH_SHORT).show()
                        }
                    }

                    override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                        // Handle failure
                        Toast.makeText(this@Login_Activity, "Login failed: ${t.message}", Toast.LENGTH_SHORT).show()
                    }
                })
            } else {
                Toast.makeText(this, "Invalid format email", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT).show()
        }
    }
}

private fun ApiService.loginUser(loginRequest: LoginRequest): Call<LoginResponse> {
    return this.loginUser(loginRequest)
}
