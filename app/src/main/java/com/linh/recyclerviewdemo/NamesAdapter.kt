package com.linh.recyclerviewdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.linh.recyclerviewdemo.databinding.ItemNameBinding

class NamesAdapter(val items: List<String>) : RecyclerView.Adapter<NamesAdapter.NameViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemNameBinding.inflate(layoutInflater, parent, false)
        return NameViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        holder.binding.textName.text = items[position]
        holder.binding.root.setOnClickListener {
            Toast.makeText(holder.binding.root.context, items[position], Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class NameViewHolder(val binding: ItemNameBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}