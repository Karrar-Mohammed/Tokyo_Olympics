package com.example.tokyoolympics.data

object DataManager {
    private val countryList = mutableListOf<Country>()
    val countries: List<Country>
        get() = countryList

    fun addCountry(country: Country) {
        countryList.add(country)
    }

}