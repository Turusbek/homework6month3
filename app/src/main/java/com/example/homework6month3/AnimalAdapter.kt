package com.example.homework6month3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter(private val data: ArrayList<Animal>,private val onItemClick: OnItemClick) :
    RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        return AnimalViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_animal, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bind()
        holder.itemView.setOnClickListener{
       onItemClick.onClick(data.get(position))
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var tvName: TextView
        private var tvAge: TextView
        init {
            tvName = itemView.findViewById(R.id.tv_name)
            tvAge = itemView.findViewById(R.id.tv_age)
        }

        fun bind() {
            val item = data[adapterPosition]
            tvName.text = item.name
            tvAge.text = item.age.toString()
        }
    }
}