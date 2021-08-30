package com.example.tokyoolympics.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tokyoolympics.data.DataManager
import com.example.tokyoolympics.databinding.ActivityMainBinding
import com.example.tokyoolympics.utils.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setup()
    }

    private fun setup() {
        parseFile()
        val adapter = CountryAdapter(DataManager.countries)
        binding.recyclerCountry.adapter = adapter
    }

    private fun parseFile() {
        val inputStream = assets.open("tokyo_2021.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        buffer.forEachLine {
            val country = CsvParser.parse(it)
            DataManager.addCountry(country)
        }
    }
}