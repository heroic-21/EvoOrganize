package com.example.evoorganize

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tambahkan fragmen hanya jika savedInstanceState null
        if (savedInstanceState == null) {
            replaceFragment(CreateKegiatanFragment(), "CreateKegiatanFragment")
        }

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.button_bashboard -> {
                    replaceFragment(DashboardFragment())
                    true
                }
                R.id.button_kegiatan -> {
                    replaceFragment(KegiatanFragment())
                    true
                }
                R.id.button_organisasi -> {
                    replaceFragment(OrganisasiFragment())
                    true
                }
                R.id.button_profile -> {
                    replaceFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }

        replaceFragment(DashboardFragment())
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_container, fragment)
            .commit()
    }

    private fun replaceFragment(fragment: Fragment, tag: String) {
        // Hanya ganti fragmen jika fragmen yang ingin ditampilkan berbeda dengan yang sedang ditampilkan
        val currentFragment = supportFragmentManager.findFragmentById(R.id.frame_container)
        if (currentFragment == null || currentFragment.javaClass != fragment.javaClass) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frame_container, fragment, tag)
                .addToBackStack(null)
                .commit()
        }
    }
}
