package com.umesh.indra.presentation.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.umesh.indra.BuildConfig
import com.umesh.indra.data.remote.mapper.toWeather
import com.umesh.indra.data.remote.network.RetrofitProvider
import com.umesh.indra.presentation.home.HomeUiState
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {
    var uiState by mutableStateOf(
        HomeUiState()
    )
        private set

    fun getWeather(city: String) {
        viewModelScope.launch {
            try {

                val response = RetrofitProvider.api.getCurrentWeather(
                    city = city,
                    apiKey = BuildConfig.WEATHER_API_KEY
                )


                Log.d(
                    "RAW_RESPONSE",
                    response.toString()
                )

                val weather = response.toWeather()

                Log.d(
                    "WEATHER_RESPONSE",
                    weather.toString()
                )
            uiState = uiState.copy(isLoading = false, weather = weather)

            } catch (e: Exception) {
                Log.e("WEATHER_ERROR", e.stackTraceToString())
                uiState = uiState.copy(
                    isLoading = false,
                    error = e.message
                )

            }

        }
    }
}