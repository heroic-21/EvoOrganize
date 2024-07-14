package com.example.evoorganize

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.GridLayoutManager
import com.example.evoorganize.adapters.KegiatanAdapter
import com.example.evoorganize.adapters.TugasAdapter
import com.example.evoorganize.databinding.FragmentKegiatanBinding

class KegiatanFragment : Fragment() {
    private var _binding: FragmentKegiatanBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentKegiatanBinding.inflate(inflater, container, false)
        val view = binding.root

        setupRecyclerViews()

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.AddButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.frame_container, CreateKegiatanFragment())
                .addToBackStack(null)
                .commit()
        }
    }

    private fun setupRecyclerViews() {
        // Sample data
        val kegiatanList = listOf(Kegiatan(1, "Udin", "url"), Kegiatan(2, "Samsul", "url")
            , Kegiatan(2, "Samsul", "url")
            , Kegiatan(2, "Samsul", "url")
            , Kegiatan(2, "Samsul", "url")
            , Kegiatan(2, "Samsul", "url")
        )

        // Setup Kegiatan RecyclerView
        binding.recyclerViewKegiatan.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = KegiatanAdapter(kegiatanList)
        }

        binding.recyclerViewKegiatan2.apply {
            layoutManager = GridLayoutManager(context, 2) // 2 kolom
            adapter = KegiatanAdapter(kegiatanList)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
