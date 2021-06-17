package com.linh.recyclerviewdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.linh.recyclerviewdemo.databinding.FragmentRecyclerViewBinding

class RecyclerViewFragment : Fragment() {
    private lateinit var binding : FragmentRecyclerViewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRecyclerViewBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = listOf("Hello", "Hi", "How are you?", "I'm fine", "Hello", "Hi", "How are you?", "I'm fine", "Hello", "Hi", "How are you?", "I'm fine", "Hello", "Hi", "How are you?", "I'm fine", "Hello", "Hi", "How are you?", "I'm fine", "Hello", "Hi", "How are you?", "I'm fine", "Hello", "Hi", "How are you?", "I'm fine")
        val adapter = RecyclerViewAdapter(list)

        binding.recyclerRecycyclerview.adapter = adapter
        binding.recyclerRecycyclerview.layoutManager = LinearLayoutManager(requireContext())
    }
}