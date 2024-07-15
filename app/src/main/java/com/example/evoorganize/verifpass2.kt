
package com.example.verifpass2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.evoorganize.R

class verifpass2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_verifpass2)

        val password1 = findViewById<EditText>(R.id.editTextPassword1)
        val password2 = findViewById<EditText>(R.id.editTextPassword2)
        val buttonConfirm = findViewById<Button>(R.id.buttonConfirm)

        buttonConfirm.setOnClickListener {
            if (password1.text.toString() == password2.text.toString()) {
                Toast.makeText(this, "Password Confirmed", Toast.LENGTH_SHORT).show()
                // Proceed with password change logic
            } else {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
