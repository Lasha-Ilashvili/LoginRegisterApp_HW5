package com.example.loginregisterapp_hw5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginregisterapp_hw5.databinding.ActivityRegistration2Binding

class Registration2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistration2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistration2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            finish()
        }

        binding.signUp.setOnClickListener {
            if (binding.usernameEditTextSignup.text.toString().isNotEmpty()) {
                // Start the new activity to navigate to DestinationActivity.
                startActivity(Intent(this, DestinationActivity::class.java))
            }
        }
    }
}
