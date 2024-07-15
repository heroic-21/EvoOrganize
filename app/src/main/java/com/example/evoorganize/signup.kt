package com.example.signup

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.evoorganize.R

class signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_signup)

        val fullName = findViewById<EditText>(R.id.editTextFullName)
        val username = findViewById<EditText>(R.id.editTextUsername)
        val email = findViewById<EditText>(R.id.editTextEmail)
        val phone = findViewById<EditText>(R.id.editTextPhone)
        val password = findViewById<EditText>(R.id.editTextPassword)
        val confirmPassword = findViewById<EditText>(R.id.editTextConfirmPassword)
        val buttonSignUp = findViewById<Button>(R.id.buttonSignUp)

        buttonSignUp.setOnClickListener {
            if (password.text.toString() == confirmPassword.text.toString()) {
                Toast.makeText(this, "Sign Up Successful", Toast.LENGTH_SHORT).show()
                // Proceed with sign up logic
            } else {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
