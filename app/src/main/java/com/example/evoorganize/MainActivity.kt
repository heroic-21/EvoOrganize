package com.example.evoorganize

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mendapatkan referensi ke ImageView dari layout
        val imageView: ImageView = findViewById(R.id.img_view)

        // Mengatur gambar dari drawable ke ImageView
        imageView.setImageResource(R.drawable.ic_launcher_foreground)
    }
}
