package com.example.loginregisterapp_hw5

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import androidx.appcompat.app.AppCompatActivity
import com.example.loginregisterapp_hw5.databinding.ActivityRegistration1Binding
import com.google.firebase.auth.FirebaseAuth

class Registration1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistration1Binding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistration1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            finish()
        }

        binding.next.setOnClickListener {
            val email: String = binding.mailSignupEditText.text.toString()
            val password: String = binding.passwordSignupEditText.text.toString()

            if (inputIsValid(email, password)) {
                auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this)
                { task ->
                    if (task.isSuccessful) {
                        // Start the new activity to navigate to Registration2Activity.
                        startActivity(Intent(this, Registration2Activity::class.java))
                    } else {

                    }
                }
            }
        }
    }

    private fun inputIsValid(email: String, password: String) =
        email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches() &&
                password.isNotEmpty() && password.length >= 8
}
