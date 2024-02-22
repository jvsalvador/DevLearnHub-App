package com.example.devlearnhub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.devlearnhub.databinding.LayoutJuniorActivityBinding
import com.example.devlearnhub.menu_nav.About_Us_Activity
import com.example.devlearnhub.menu_nav.Computer_Fundamentals_Activity
import com.example.devlearnhub.menu_nav.Contact_Us_Activity
import com.example.devlearnhub.menu_nav.Networking_Fundamentals_Activity
import com.google.android.material.navigation.NavigationView

class Junior_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutJuniorActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutJuniorActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toggle = ActionBarDrawerToggle(this, binding.drawerLayout, binding.toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        val navView: NavigationView = findViewById(R.id.nav_view)
        val userEmail = intent.getStringExtra("user_email")
        val headerView = navView.getHeaderView(0)
        val emailTextView: TextView = headerView.findViewById(R.id.et_email)
        emailTextView.text = userEmail

        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_course -> {

                    if (this !is Junior_Activity){
                        val intent = Intent(this, Junior_Activity::class.java)
                        startActivity(intent)
                    }
                    true
                }
                R.id.nav_computer -> {
                    val intent = Intent(this, Computer_Fundamentals_Activity::class.java)
                    startActivity(intent)

                    true
                }
                R.id.nav_laboratory -> {
                    val intent = Intent(this, Networking_Fundamentals_Activity::class.java)
                    startActivity(intent)

                    true
                }
                R.id.nav_logout -> {
                    val intent = Intent(this, Login_Activity::class.java)
                    startActivity(intent)
                    Toast.makeText(this, "Logout Successful", Toast.LENGTH_SHORT).show()

                    true
                }
                R.id.nav_back -> {
                    val email = intent.getStringExtra("user_email")
                    val intent = Intent(this, Choices_Activity::class.java)
                    intent.putExtra("user_email", email)
                    startActivity(intent)

                    true
                }
                R.id.nav_contact -> {
                    val intent = Intent(Intent.ACTION_SENDTO).apply {
                        data = Uri.parse("mailto:")
                        putExtra(Intent.EXTRA_EMAIL, arrayOf("sjeanreyvincent@email.com"))
                        putExtra(Intent.EXTRA_SUBJECT, "Contact Us")
                        putExtra(Intent.EXTRA_TEXT, "Hello, I have a question about...")
                    }
                    if (intent.resolveActivity(packageManager) != null) {
                        startActivity(intent)
                    } else {
                        // No email app installed
                        Toast.makeText(this, "No email app installed", Toast.LENGTH_SHORT).show()
                    }

                    true
                }

                R.id.nav_about -> {
                    val intent = Intent(this, About_Us_Activity::class.java)
                    startActivity(intent)

                    true
                }

                else -> false
            }
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