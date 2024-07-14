package com.example.evoorganize

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.evoorganize.databinding.FragmentCreateKegiatanBinding
import com.example.evoorganize.ui.tambahanggota.TambahAnggotaFragment

class CreateKegiatanFragment : Fragment() {
    private var _binding: FragmentCreateKegiatanBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCreateKegiatanBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.callAddAnggota.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.frame_container, TambahAnggotaFragment())
                .addToBackStack(null)
                .commit()
        }

        binding.callAddDivisi.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.frame_container, TambahDivisiFragment())
                .addToBackStack(null)
                .commit()
        }

        binding.ButtonBack.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
