package com.example.motionlayoutsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SimpleListAdapter : RecyclerView.Adapter<SimpleListAdapter.SimpleViewHolder>() {

    private val items = List(20) { it }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_simple, parent, false)
        return SimpleViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        holder.bind(items[position])
    }

    class SimpleViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(value: Int) {
            itemView.findViewById<TextView>(R.id.text_value).apply {
                text = value.toString()
            }
        }
    }
}
