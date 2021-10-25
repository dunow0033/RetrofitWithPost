package com.example.retrofitwithpost

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitwithpost.databinding.RecyclerRowListBinding

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    var userList = mutableListOf<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = RecyclerRowListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.MyViewHolder, position: Int) {
        holder.bind(userList[position])
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class MyViewHolder(val binding: RecyclerRowListBinding) : RecyclerView.ViewHolder(binding.root){
        val textViewName = binding.textViewName
        val textViewEmail = binding.textViewEmail
        val textViewStats = binding.textViewStatus

        fun bind(data : User){
            textViewName.text = data.name
            textViewEmail.text = data.email
            textViewStats.text = data.status
        }
    }
}