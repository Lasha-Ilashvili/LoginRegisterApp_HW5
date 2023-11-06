package com.example.loginregisterapp_hw5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginregisterapp_hw5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.logIn.setOnClickListener {
            // Start the new activity to navigate to the LogInActivity.
            startActivity(Intent(this, LogInActivity::class.java))
        }

        binding.register.setOnClickListener {
            // Start the new activity to navigate to the Registration1Activity.
            startActivity(Intent(this, Registration1Activity::class.java))
        }
    }
}