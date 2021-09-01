package com.example.tokyoolympics.utils

import com.example.tokyoolympics.data.Country

object CsvParser {
    fun parse(line: String): Country {
        val tokens = line.split(",")

        return Country(
            rank = tokens[Constants.ColumnIndex.RANK].toInt(),
            name = tokens[Constants.ColumnIndex.NAME],
            goldMedal = tokens[Constants.ColumnIndex.GOLD_MEDAL].toInt(),
            silverMedal = tokens[Constants.ColumnIndex.SILVER_MEDAL].toInt(),
            bronzeMedal = tokens[Constants.ColumnIndex.BRONZE_MEDAL].toInt(),
            total = tokens[Constants.ColumnIndex.TOTAL].toInt()
        )
    }
}