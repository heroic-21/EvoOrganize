package com.example.evoorganize

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.evoorganize.databinding.FragmentDashboardBinding
import com.example.evoorganize.adapters.KegiatanAdapter
import com.example.evoorganize.adapters.TugasAdapter

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val view = binding.root

        // Initialize RecyclerViews
        setupRecyclerViews()

        return view
    }

    private fun setupRecyclerViews() {
        // Sample data
        val kegiatanList = listOf(Kegiatan(1, "Udin", "url"), Kegiatan(2, "Samsul", "url")
            , Kegiatan(2, "Samsul", "url")
            , Kegiatan(2, "Samsul", "url")
            , Kegiatan(2, "Samsul", "url")
            , Kegiatan(2, "Samsul", "url")
            , Kegiatan(2, "Samsul", "url")
        )
        val tugasList = listOf(Tugas(1, "Tugas Pemerkosaan", "Ini Tugas Penting Anjing"),
            Tugas(1, "Tugas Pemerkosaan", "Ini Tugas Penting Anjing"),
            Tugas(1, "Tugas Pemerkosaan", "Ini Tugas Penting Anjing"),
            Tugas(1, "Tugas Pemerkosaan", "Ini Tugas Penting Anjing"),
            Tugas(1, "Tugas Pemerkosaan", "Ini Tugas Penting Anjing"),
            Tugas(1, "Tugas Pemerkosaan", "Ini Tugas Penting Anjing"),
            Tugas(1, "Tugas Pemerkosaan", "Ini Tugas Penting Anjing"),
            Tugas(1, "Tugas Pemerkosaan", "Ini Tugas Penting Anjing"),
            Tugas(1, "Tugas Pemerkosaan", "Ini Tugas Penting Anjing"),
            Tugas(1, "Tugas Pemerkosaan", "Ini Tugas Penting Anjing"),
            Tugas(1, "Tugas Pemerkosaan", "Ini Tugas Penting Anjing"))

        // Setup Kegiatan RecyclerView
        binding.recyclerViewKegiatan.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = KegiatanAdapter(kegiatanList)
        }

        // Setup Tugas RecyclerView
        binding.recyclerViewTugas.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = TugasAdapter(tugasList)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
