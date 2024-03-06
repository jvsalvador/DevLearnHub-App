import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.devlearnhub.data.ApiService
import com.example.devlearnhub.data.RegistrationRequest
import com.example.devlearnhub.data.RegistrationResponse
import com.example.devlearnhub.data.ValidationUtils
import com.example.devlearnhub.databinding.LayoutRegisterActivityBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Register_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutRegisterActivityBinding
    private lateinit var apiService: ApiService // Retrofit API Service
    private val BASE_URL = "your_base_url_here"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutRegisterActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize Retrofit API Service
        apiService = RetrofitClient.getClient(BASE_URL).create(ApiService::class.java)

        binding.btRegisterCreateAccount.setOnClickListener {
            registerUser()
        }

        binding.tvRegisterLogin.setOnClickListener {
            startActivity(Intent(this, Login_Activity::class.java))
        }
    }

    private fun registerUser() {
        val firstname = binding.etRegisterFirstname.text.toString()
        val lastname = binding.etRegisterLastName.text.toString()
        val email = binding.etRegisterEmail.text.toString()
        val password = binding.etRegisterPassword.text.toString()
        val confirmString = binding.etRegisterConfirm.text.toString()

        if (ValidationUtils.isTextNotEmpty(firstname) &&
            ValidationUtils.isTextNotEmpty(lastname) &&
            ValidationUtils.isTextNotEmpty(email) &&
            ValidationUtils.isTextNotEmpty(password) &&
            ValidationUtils.isTextNotEmpty(confirmString)
        ) {
            if (ValidationUtils.isValidEmail(email)) {
                if (password == confirmString) {
                    // Create registration request
                    val registrationRequest = RegistrationRequest(firstname, lastname, email, password)

                    // Make API call for registration
                    val registrationCall = apiService.registerUser(registrationRequest)
                    registrationCall.enqueue(object : Callback<RegistrationResponse> {
                        override fun onResponse(call: Call<RegistrationResponse>, response: Response<RegistrationResponse>) {
                            if (response.isSuccessful) {
                                val registrationResponse = response.body()
                                // Handle successful registration
                                Toast.makeText(this@Register_Activity, "User Registered", Toast.LENGTH_SHORT).show()
                                startActivity(Intent(this@Register_Activity, Login_Activity::class.java))
                                finish()
                            } else {
                                // Handle unsuccessful registration
                                Toast.makeText(this@Register_Activity, "Registration failed", Toast.LENGTH_SHORT).show()
                            }
                        }

                        override fun onFailure(call: Call<RegistrationResponse>, t: Throwable) {
                            // Handle failure
                            Toast.makeText(this@Register_Activity, "Registration failed: ${t.message}", Toast.LENGTH_SHORT).show()
                        }
                    })
                } else {
                    Toast.makeText(this, "Password and confirm password do not match", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Invalid email format", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Please input all fields", Toast.LENGTH_SHORT).show()
        }
    }
}
