package com.example.gantipass

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.evoorganize.R


class gantipass : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_gantipass)

        val fullnameEditText = findViewById<EditText>(R.id.fullname)
        val emailEditText = findViewById<EditText>(R.id.email)
        val usernameEditText = findViewById<EditText>(R.id.username)
        val submitButton = findViewById<Button>(R.id.submit)

        submitButton.setOnClickListener {
            val fullname = fullnameEditText.text.toString()
            val email = emailEditText.text.toString()
            val username = usernameEditText.text.toString()

            if (fullname.isEmpty() || email.isEmpty() || username.isEmpty()) {
                Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show()
            } else {
                // Handle password reset logic here
                Toast.makeText(this, "Request Sent", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
