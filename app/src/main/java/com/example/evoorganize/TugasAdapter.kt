package com.example.evoorganize.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.evoorganize.databinding.ItemTugasBinding
import com.example.evoorganize.Tugas

class TugasAdapter(private val tugasList: List<Tugas>) : RecyclerView.Adapter<TugasAdapter.TugasViewHolder>() {

    class TugasViewHolder(val binding: ItemTugasBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TugasViewHolder {
        val binding = ItemTugasBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TugasViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TugasViewHolder, position: Int) {
        val tugas = tugasList[position]
        holder.binding.textJudulTugas.text = tugas.judul
        holder.binding.textDeskripsiTugas.text = tugas.deskripsi
        // Set more properties if needed
    }

    override fun getItemCount(): Int = tugasList.size
}
