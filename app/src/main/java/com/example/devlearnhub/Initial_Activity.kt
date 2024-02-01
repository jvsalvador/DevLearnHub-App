package com.example.devlearnhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.example.devlearnhub.databinding.LayoutInitialActivityBinding


class Initial_Activity : AppCompatActivity() {

    private lateinit var binding: LayoutInitialActivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutInitialActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val toggle = ActionBarDrawerToggle(this, binding.drawerLayout, binding.toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // Set up the NavigationView
        val navView: NavigationView = findViewById(R.id.nav_view)
        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_course -> {

                    if (this !is Initial_Activity){
                        val intent = Intent(this, Initial_Activity::class.java)
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
                    true
                }
                R.id.nav_dsa -> {
                    true
                }
                R.id.nav_logout -> {
                    val intent = Intent(this, Login_Activity::class.java)
                    startActivity(intent)
                    Toast.makeText(this, "Logout Successful", Toast.LENGTH_SHORT).show()

                    true
                }
                R.id.nav_contact -> {
                    true
                }
                R.id.nav_rate -> {
                    true
                }
                R.id.nav_about -> {
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
