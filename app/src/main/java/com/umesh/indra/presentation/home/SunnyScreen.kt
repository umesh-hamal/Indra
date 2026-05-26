package com.umesh.indra.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.umesh.indra.domain.model.Weather
import com.umesh.indra.presentation.home.components.WeatherHomeCard
import com.umesh.indra.presentation.home.components.WeatherHomeChip
import com.umesh.indra.presentation.home.components.WeatherSearchBar
import com.umesh.indra.presentation.home.components.WeatherTemperature
import com.umesh.indra.presentation.viewmodel.WeatherViewModel
import com.umesh.indra.ui.theme.Sunny
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

@Composable
fun SunnyScreen(uiState: Weather, viewModel: WeatherViewModel) {
    var searchQuery by remember { mutableStateOf("") }


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Sunny
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val weather = uiState
            WeatherSearchBar(searchQuery = searchQuery, onQueryChange = {searchQuery = it}, onSearch = {viewModel.getWeather(searchQuery)} )
            WeatherTemperature(weather.cityName, weather.temperature, weather.feelsLike)
            WeatherHomeChip(weather.tempMax, weather.tempMin, weather.description)
            WeatherHomeCard(
                weather.windSpeed,
                weather.humidity,
                weather.visibility,
                weather.sealevel
            )
        }


    }
}