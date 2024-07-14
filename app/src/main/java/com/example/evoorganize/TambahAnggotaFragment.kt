package com.example.evoorganize.ui.tambahanggota

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.evoorganize.adapters.AnggotaAdapter
import com.example.evoorganize.databinding.FragmentTambahAnggotaBinding
import com.example.evoorganize.Anggota
import com.example.evoorganize.CreateKegiatanFragment
import com.example.evoorganize.R

class TambahAnggotaFragment : Fragment() {

    private var _binding: FragmentTambahAnggotaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTambahAnggotaBinding.inflate(inflater, container, false)
        val view = binding.root

        // Initialize RecyclerView
        setupRecyclerView()

        return view
    }

    private fun setupRecyclerView() {
        // Sample data
        val anggotaList = listOf(
            Anggota("John Doe", "Manager"),
            Anggota("Jane Smith", "Developer"),
            Anggota("Alice Johnson", "Designer"),
            Anggota("Jane Smith", "Developer"),
            Anggota("Jane Smith", "Developer"),
            Anggota("Jane Smith", "Developer"),
            Anggota("Jane Smith", "Developer"),
            Anggota("Jane Smith", "Developer"),
            Anggota("Jane Smith", "Developer"),
            Anggota("Jane Smith", "Developer"),
            Anggota("Jane Smith", "Developer"),
            Anggota("Jane Smith", "Developer"),
            Anggota("Jane Smith", "Developer"),

        )

        binding.recyclerViewAnggota.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = AnggotaAdapter(anggotaList)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.AddButton.setOnClickListener {
//            parentFragmentManager.beginTransaction()
//                .replace(R.id.frame_container, CreateKegiatanFragment())
//                .addToBackStack(null)
//                .commit()
//        }
        binding.ButtonBackToKegiatanFragment.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
