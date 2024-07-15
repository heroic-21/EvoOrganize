package com.example.landing2

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
        setContentView(R.layout.fragment_landing2)

        val imgClFoto: ImageView = findViewById(R.id.img_cl_foto)
        val imgClFoto2: ImageView = findViewById(R.id.img_cl_foto2)
        val txtClNama: TextView = findViewById(R.id.txt_cl_nama)
        val btnSelanjutnya: Button = findViewById(R.id.btn_selajutnya)

        btnSelanjutnya.setOnClickListener {
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
            // Add your navigation or other actions here
        }
    }
}
