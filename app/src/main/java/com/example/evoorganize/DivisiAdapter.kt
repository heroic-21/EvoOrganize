package com.example.evoorganize.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.evoorganize.databinding.ItemDivisiBinding
import com.example.evoorganize.Divisi
import android.widget.Spinner

class DivisiAdapter(private val divisiList: List<Divisi>) : RecyclerView.Adapter<DivisiAdapter.DivisiViewHolder>() {

    class DivisiViewHolder(val binding: ItemDivisiBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DivisiViewHolder {
        val binding = ItemDivisiBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DivisiViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DivisiViewHolder, position: Int) {
        val divisi = divisiList[position]
        holder.binding.NamaJobdesk.text = null
        holder.binding.spinnerDivisi.adapter = null
    }

    override fun getItemCount(): Int = divisiList.size
}
