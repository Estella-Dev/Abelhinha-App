package com.example.abelhinhaapp.helpers

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(val list: List<String>) : RecyclerView.Adapter<ListAdapter.ItemViewHolder>() {

    class ItemViewHolder(carditem : View ) : RecyclerView.ViewHolder(carditem){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}