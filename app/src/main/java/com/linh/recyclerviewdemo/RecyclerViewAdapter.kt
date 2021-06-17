package com.linh.recyclerviewdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.linh.recyclerviewdemo.databinding.ItemHolderBinding

class RecyclerViewAdapter(val list: List<String>) : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val binding = ItemHolderBinding.inflate(layoutInflater, parent, false)
        val holder = RecyclerViewViewHolder(binding)

        return holder
    }

    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        val content = holder.binding.textHolderContent
        val data = list[position]

        content.text = data
    }

    override fun getItemCount() = list.size

    class RecyclerViewViewHolder(val binding: ItemHolderBinding) : RecyclerView.ViewHolder(binding.root)
}

