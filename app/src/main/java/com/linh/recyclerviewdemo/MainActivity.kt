package com.linh.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.linh.recyclerviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        val list = listOf("Linh", "Khánh", "Triet", "Tam", "Ngoc Anh")
        binding.recyclerviewMainNames.adapter = NamesAdapter(list)
        binding.recyclerviewMainNames.layoutManager = LinearLayoutManager(this)
    }
}