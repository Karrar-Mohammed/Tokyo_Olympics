package com.example.tokyoolympics.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tokyoolympics.R
import com.example.tokyoolympics.data.Country
import com.example.tokyoolympics.ui.viewHolders.CountryViewHolder

class CountryAdapter(val list: List<Country>) : RecyclerView.Adapter<CountryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val currentCountry = list[position]
        holder.apply {
            rank.text = currentCountry.rank.toString()
            countryName.text = currentCountry.name
            goldMedal.text = currentCountry.goldMedal.toString()
            silverMedal.text = currentCountry.silverMedal.toString()
            bronzeMedal.text = currentCountry.bronzeMedal.toString()
            total.text = currentCountry.total.toString()
        }
    }

    override fun getItemCount() = list.size
}