package com.example.devlearnhub

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.devlearnhub.databinding.LayoutInitialActivityBinding
import com.example.devlearnhub.menu_nav.About_Us_Activity
import com.example.devlearnhub.menu_nav.Contact_Us_Activity
import com.example.devlearnhub.module_activity.Html_Activity
import com.example.devlearnhub.module_activity.Java_Activity
import com.example.devlearnhub.module_activity.Python_Activity
import com.google.android.material.navigation.NavigationView


class Initial_Activity : AppCompatActivity() {

    private lateinit var binding: LayoutInitialActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutInitialActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLearn.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Python_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
        binding.btnLearn2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Java_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
        binding.btnLearn3.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Html_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

        // Navigation Drawer
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

                    if (this !is Initial_Activity){
                        val intent = Intent(this, Initial_Activity::class.java)
                        startActivity(intent)
                    }
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
                    val email = intent.getStringExtra("user_email")
                    val intent = Intent(this, Contact_Us_Activity::class.java)
                    startActivity(intent)
                    intent.putExtra("user_email", email)

                    true
                }

                R.id.nav_about -> {
                    val email = intent.getStringExtra("user_email")
                    val intent = Intent(this, About_Us_Activity::class.java)
                    startActivity(intent)
                    intent.putExtra("user_email", email)

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
