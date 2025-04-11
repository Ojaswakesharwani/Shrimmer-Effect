package com.example.shrimmereffect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VerticalAdapter (private val itemList: List<DataItem>) :
    RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder>() {

    inner class VerticalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageViewVertical)
        val titleView: TextView = itemView.findViewById(R.id.textViewTitle)
        val descriptionView: TextView = itemView.findViewById(R.id.textViewDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_vertical, parent, false)
        return VerticalViewHolder(view)
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        val item = itemList[position]
        holder.imageView.setImageResource(item.imageResId)
        holder.titleView.text = item.title
        holder.descriptionView.text = item.description
    }

    override fun getItemCount() = itemList.size
}