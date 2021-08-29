package com.example.tokyoolympics.data

object DataManager {
    private val countryList = mutableListOf<Country>()

    fun addCountry(country: Country) {
        countryList.add(country)
    }

}