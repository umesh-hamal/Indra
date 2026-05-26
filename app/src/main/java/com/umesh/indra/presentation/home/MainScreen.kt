package com.umesh.indra.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.umesh.indra.presentation.viewmodel.WeatherViewModel

@Composable
fun MainScreen(
    viewModel: WeatherViewModel = viewModel()
) {

    val uiState = viewModel.uiState


    LaunchedEffect(Unit) {
        viewModel.getWeather("Pokhara")
    }

    when {
        uiState.error != null -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = uiState.error ?: "Unknown Error",
                    style = MaterialTheme.typography.displayLarge
                )

            }
        }

        uiState.isLoading -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CircularProgressIndicator()
            }

        }
        uiState.weather != null -> SunnyScreen(uiState.weather,viewModel)


    }
}
