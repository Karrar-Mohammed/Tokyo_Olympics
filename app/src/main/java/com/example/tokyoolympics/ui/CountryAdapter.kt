package com.example.tokyoolympics.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tokyoolympics.R
import com.example.tokyoolympics.data.Country
import com.example.tokyoolympics.databinding.ItemCountryBinding

class CountryAdapter(private val list: List<Country>, private val listener: CountryInteractionListener) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val currentCountry = list[position]
        holder.binding.apply {
            textRank.text = currentCountry.rank.toString()
            textCountryName.text = currentCountry.name
            textGoldMedal.text = currentCountry.goldMedal.toString()
            textSilverMedal.text = currentCountry.silverMedal.toString()
            textBronzeMedal.text = currentCountry.bronzeMedal.toString()
            textTotal.text = currentCountry.total.toString()
            textCountryName.setOnClickListener { listener.onclickCountryName(currentCountry.name) }
            root.setOnClickListener { listener.onClickItem(currentCountry) }
        }
    }

    override fun getItemCount() = list.size

    class CountryViewHolder(viewItem: View): RecyclerView.ViewHolder(viewItem) {
        val binding = ItemCountryBinding.bind(viewItem)
    }
}