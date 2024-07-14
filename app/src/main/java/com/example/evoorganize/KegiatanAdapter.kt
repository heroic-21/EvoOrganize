package com.example.evoorganize.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.evoorganize.databinding.ItemKegiatanBinding
import com.example.evoorganize.Kegiatan

class KegiatanAdapter(private val kegiatanList: List<Kegiatan>) : RecyclerView.Adapter<KegiatanAdapter.KegiatanViewHolder>() {

    class KegiatanViewHolder(val binding: ItemKegiatanBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KegiatanViewHolder {
        val binding = ItemKegiatanBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return KegiatanViewHolder(binding)
    }
    override fun onBindViewHolder(holder: KegiatanViewHolder, position: Int) {
        val kegiatan = kegiatanList[position]
        holder.binding.alertTextView.text = kegiatan.nama
    }

    override fun getItemCount(): Int = kegiatanList.size
}
