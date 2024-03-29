package com.example.devlearnhub


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.devlearnhub.databinding.LayoutInitialActivityBinding
import com.example.devlearnhub.menu_nav.AboutUsActivity
import com.example.devlearnhub.menu_nav.ContactUsActivity
import com.example.devlearnhub.module_activity.HtmlActivity
import com.example.devlearnhub.module_activity.JavaActivity
import com.example.devlearnhub.module_activity.PythonActivity
import com.google.android.material.navigation.NavigationView


class InitialActivity : AppCompatActivity() {

    private lateinit var binding: LayoutInitialActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutInitialActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val email = intent.getStringExtra("user_email")

        // Navigation Drawer
        val toggle = ActionBarDrawerToggle(this, binding.drawerLayout, binding.toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        val navView: NavigationView = findViewById(R.id.nav_view)
        val headerView = navView.getHeaderView(0)
        val emailTextView: TextView = headerView.findViewById(R.id.et_email)
        emailTextView.text = email

        Log.d("UserEmail", "The user's email is: $email")

        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_course -> {
                    val url = "https://devlearn-com.preview-domain.com/public/"
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                    startActivity(intent)
                    true
                }
                R.id.nav_logout -> {
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(this, "Logout Successful", Toast.LENGTH_SHORT).show()

                    true
                }
                R.id.nav_back -> {
                    val email = intent.getStringExtra("user_email")
                    val intent = Intent(this, ChoicesActivity::class.java)
                    intent.putExtra("user_email", email)
                    startActivity(intent)

                    true
                }
                R.id.nav_contact -> {
                    val email = intent.getStringExtra("user_email")
                    val intent = Intent(this, ContactUsActivity::class.java)
                    startActivity(intent)
                    intent.putExtra("user_email", email)

                    true
                }

                R.id.nav_about -> {
                    val email = intent.getStringExtra("user_email")
                    val intent = Intent(this, AboutUsActivity::class.java)
                    startActivity(intent)
                    intent.putExtra("user_email", email)

                    true
                }

                else -> false
            }
        }

        binding.btnLearn.setOnClickListener {
            val intent = Intent(this, PythonActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
        binding.btnLearn2.setOnClickListener {
            val intent = Intent(this, JavaActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
        binding.btnLearn3.setOnClickListener {
            val intent = Intent(this, HtmlActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }

    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}
