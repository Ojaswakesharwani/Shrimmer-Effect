package com.example.shrimmereffect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HorizontalAdapter(private val itemList: List<DataItem>) :
    RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder>() {

    inner class HorizontalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageViewHorizontal)
        val textView: TextView = itemView.findViewById(R.id.textViewHorizontal)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_horizontal, parent, false)
        return HorizontalViewHolder(view)
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        val item = itemList[position]
        holder.imageView.setImageResource(item.imageResId)
        holder.textView.text = item.title
    }

    override fun getItemCount() = itemList.size
}
