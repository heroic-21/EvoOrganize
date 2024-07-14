package com.example.evoorganize.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.evoorganize.databinding.ItemAnggotaAdapterBinding
import com.example.evoorganize.Anggota

class AnggotaAdapter(private val anggotaList: List<Anggota>) : RecyclerView.Adapter<AnggotaAdapter.AnggotaViewHolder>() {

    class AnggotaViewHolder(val binding: ItemAnggotaAdapterBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnggotaViewHolder {
        val binding = ItemAnggotaAdapterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnggotaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnggotaViewHolder, position: Int) {
        val anggota = anggotaList[position]
        holder.binding.textName.text = anggota.name
        holder.binding.roleTextView.text = anggota.role
    }

    override fun getItemCount(): Int = anggotaList.size
}
