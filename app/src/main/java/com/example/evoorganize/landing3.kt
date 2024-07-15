package com.example.landing3

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.evoorganize.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_landing3)

        val imgClFoto: ImageView = findViewById(R.id.img_cl_foto)
        val imgClFoto2: ImageView = findViewById(R.id.img_cl_foto2)
        val txtClNama: TextView = findViewById(R.id.txt_cl_nama)
        val btnSelanjutnya: Button = findViewById(R.id.btn_selajutnya)
        val btnPunyaAkun: Button = findViewById(R.id.btn_punyaakun)

        btnSelanjutnya.setOnClickListener {
            Toast.makeText(this, "Sign In button clicked!", Toast.LENGTH_SHORT).show()
            // Add your navigation or other actions here
        }

        btnPunyaAkun.setOnClickListener {
            Toast.makeText(this, "Sign Up button clicked!", Toast.LENGTH_SHORT).show()
            // Add your navigation or other actions here
        }
    }
}
