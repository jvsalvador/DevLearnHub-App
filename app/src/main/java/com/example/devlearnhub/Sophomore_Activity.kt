package com.example.devlearnhub


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.devlearnhub.databinding.LayoutSophomoreActivityBinding
import com.example.devlearnhub.menu_nav.About_Us_Activity
import com.example.devlearnhub.menu_nav.Contact_Us_Activity
import com.example.devlearnhub.module_activity.Kotlin_Activity
import com.example.devlearnhub.module_activity.Mysql_Activity
import com.google.android.material.navigation.NavigationView

class Sophomore_Activity : AppCompatActivity() {
    private lateinit var binding: LayoutSophomoreActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutSophomoreActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLearn.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Kotlin_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
        binding.btnLearn2.setOnClickListener {
            val email = intent.getStringExtra("user_email")
            val intent = Intent(this, Mysql_Activity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }



        val toggle = ActionBarDrawerToggle(this, binding.drawerLayout, binding.toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // Set up the NavigationView
        val navView: NavigationView = findViewById(R.id.nav_view)
        val userEmail = intent.getStringExtra("user_email")
        val headerView = navView.getHeaderView(0)
        val emailTextView: TextView = headerView.findViewById(R.id.et_email)
        emailTextView.text = userEmail

        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_course -> {
                    val url = "https://devlearn-com.preview-domain.com/public/"
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                    if (intent.resolveActivity(packageManager) != null){
                        startActivity(intent)
                    }else{

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