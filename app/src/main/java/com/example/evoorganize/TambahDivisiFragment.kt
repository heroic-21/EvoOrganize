package com.example.evoorganize

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.evoorganize.adapters.DivisiAdapter
import com.example.evoorganize.databinding.FragmentTambahDivisiBinding
class TambahDivisiFragment : Fragment() {
    private var _binding: FragmentTambahDivisiBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTambahDivisiBinding.inflate(inflater, container, false)
        val view = binding.root

        setupRecyclerView()

        return view
    }

    private fun setupRecyclerView() {
        // Sample data
        val divisiList = listOf(
            Divisi("John Doe", "Dokumentasi"),
        )

        binding.recyclerViewDivisi.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = DivisiAdapter(divisiList)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ButtonBackToCreateKegiatan.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
