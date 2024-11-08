package com.example.quotesapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quotesapp.databinding.RvItemBinding

class RvAdapter(var context: Context, var quoteList: List<DataEntity>)
    : RecyclerView.Adapter<RvAdapter.ViewHolder>() {

    class ViewHolder(val binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = RvItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return quoteList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textView.text = quoteList.get(position).quote
    }

}