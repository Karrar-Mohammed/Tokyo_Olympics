package com.example.tokyoolympics.data

data class Country(
    val rank: Int,
    val name: String,
    val goldMedal: Int,
    val silverMedal: Int,
    val bronzeMedal: Int,
    val total: Int,
    val rankByTotal: Int,
    val nocCode: String
)
