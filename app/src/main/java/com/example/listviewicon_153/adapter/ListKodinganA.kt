package com.example.listviewicon_153.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewicon_153.R
import com.example.listviewicon_153.model.koding

class ListKodinganA(private val listKoding: ArrayList<koding>) : RecyclerView.Adapter<ListKodinganA.KodingViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KodingViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.listngoding, parent, false)
        return KodingViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listKoding.size
    }

    override fun onBindViewHolder(holder: KodingViewHolder, position: Int) {
        val kod = listKoding[position]
        holder.tvNama.text = kod.nama
        holder.tvDetail.text = kod.detail
        Glide.with(holder.itemView.context)
            .load(kod.logo)
            .into(holder.gambarlogo)
    }

    inner class KodingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var gambarlogo: ImageView = itemView.findViewById(R.id.gambarngoding)
    }
}