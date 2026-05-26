package com.umesh.indra.data.remote.dto

import android.opengl.Visibility
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

data class WeatherResponseDto(
    val name: String? = null,
    val main: MainDto? = null,
    val weather: List<WeatherDto> = emptyList(),
    val wind: WindDto? = null,
    val visibility: Int? = null

)


data class MainDto(
    val temp: Double? = null,

    @SerializedName("feels_like")
    val feelsLike: Double? = null,

    val humidity: Int? = null,

    @SerializedName("temp_min")
    val tempMin: Double? = null,

    @SerializedName("temp_max")
    val tempMax: Double? = null,

    @SerializedName("sea_level")
    val seaLevel: Int? = null
)


data class WeatherDto(
    val description: String? = null,
    val icon: String? = null,
    val main: String? = null
)

data class WindDto(
    val speed: Double? = null,
)