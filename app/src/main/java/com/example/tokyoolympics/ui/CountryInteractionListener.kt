package com.example.tokyoolympics.ui

import com.example.tokyoolympics.data.Country

interface CountryInteractionListener {
    fun onClickItem(country: Country)
    fun onclickCountryName(name: String)
}