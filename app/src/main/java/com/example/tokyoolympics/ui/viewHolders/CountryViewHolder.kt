package com.example.tokyoolympics.ui.viewHolders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tokyoolympics.R

class CountryViewHolder(viewItem: View): RecyclerView.ViewHolder(viewItem) {
    val rank : TextView = viewItem.findViewById(R.id.text_rank)
    val countryName : TextView = viewItem.findViewById(R.id.text_name)
    val goldMedal : TextView = viewItem.findViewById(R.id.text_gold_medal)
    val silverMedal : TextView = viewItem.findViewById(R.id.text_silver_medal)
    val bronzeMedal : TextView = viewItem.findViewById(R.id.text_bronze_medal)
    val total : TextView = viewItem.findViewById(R.id.text_total)
}