package com.example.verifpass

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.evoorganize.R

class verifpass : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_verifpass)

        val backImageView = findViewById<ImageView>(R.id.backImageView)
        val verifyButton = findViewById<Button>(R.id.verifyButton)
        val codeEditTexts = arrayOf(
            findViewById<EditText>(R.id.code1),
            findViewById<EditText>(R.id.code2),
            findViewById<EditText>(R.id.code3),
            findViewById<EditText>(R.id.code4)
        )

        backImageView.setOnClickListener {
            finish() // Close this activity and go back to the previous one
        }

        verifyButton.setOnClickListener {
            val code = codeEditTexts.joinToString("") { it.text.toString() }
            if (code.length == 4) {
                // Handle verification logic here
                Toast.makeText(this, "Verification Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter the complete code", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
