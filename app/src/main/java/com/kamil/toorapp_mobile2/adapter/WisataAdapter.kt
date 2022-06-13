package com.kamil.toorapp_mobile2.adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import androidx.recyclerview.widget.RecyclerView
import com.kamil.toorapp_mobile2.DetailActivity
import com.kamil.toorapp_mobile2.R
import com.kamil.toorapp_mobile2.api.response.ApiResponse

class WisataAdapter(private val list: ArrayList<ApiResponse>): RecyclerView.Adapter<WisataAdapter.PostViewHolder>() {
    inner class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(wisataResponse: ApiResponse){
            with(itemView){

                val text = "id: ${wisataResponse.id}\n" +
                        "title: ${wisataResponse.golonganWisata}\n" +
                        "text: ${wisataResponse.jenisWisata}"
                val tvItemName: TextView = findViewById(R.id.tv_item_name)
                val tvItemDescription: TextView = findViewById(R.id.tv_item_description)
                tvItemName.text = wisataResponse.id.toString()
                tvItemDescription.text = wisataResponse.golonganWisata
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_place, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}