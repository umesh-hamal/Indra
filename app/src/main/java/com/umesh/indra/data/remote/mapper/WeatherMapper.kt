package com.umesh.indra.data.remote.mapper

import com.umesh.indra.data.remote.dto.WeatherResponseDto
import com.umesh.indra.domain.model.Weather

fun WeatherResponseDto.toWeather(): Weather{
    return Weather(
        cityName = name ?: "Unknown",
        temperature = main?.temp ?: 0.0,
        feelsLike = main?.feelsLike ?: 0.0,
        humidity = main?.humidity ?: 0,
        description = weather.firstOrNull()?.description?:"Unknown",
        icon = weather.firstOrNull()?.icon?:"",
        windSpeed = wind?.speed ?: 0.0,
        tempMax = main?.tempMax ?: 0.0,
        tempMin = main?.tempMin ?: 0.0,
        visibility = visibility ?: 0,
        sealevel = main?.seaLevel ?: 0
    )
}