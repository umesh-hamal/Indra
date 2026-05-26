package com.umesh.indra.domain.model

import android.health.connect.datatypes.units.Temperature
import android.opengl.Visibility

data class Weather(
    val cityName: String,
    val temperature: Double,
    val feelsLike: Double,
    val humidity: Int,
    val tempMin: Double,
    val tempMax: Double,
    val description: String,
    val icon: String,
    val windSpeed: Double,
    val visibility: Int,
    val sealevel: Int
)