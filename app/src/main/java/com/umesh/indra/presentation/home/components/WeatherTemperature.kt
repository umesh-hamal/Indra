package com.umesh.indra.presentation.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.umesh.indra.R
import com.umesh.indra.ui.theme.fjallone

@Composable
fun WeatherTemperature(
    cityName: String,
    temperature: Double,
    feelsLike: Double
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            painter = painterResource(R.drawable.sunny),
            contentDescription = "Sunny Icon",
            tint = Color.Unspecified
        )

        Text(text = "$cityName", style = MaterialTheme.typography.displayLarge, fontFamily = fjallone, color = Color.White)

        Text(buildAnnotatedString {
            withStyle(SpanStyle(fontFamily = fjallone, color = Color(0xFFFFC400), fontSize = 80.sp)){
                append("${temperature.toInt()} °C\n")
            }
            append(text = "Feels like: ${feelsLike.toInt()} °C")
        }, textAlign = TextAlign.Center)
    }
}