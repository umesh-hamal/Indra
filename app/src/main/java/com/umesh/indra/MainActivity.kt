package com.umesh.indra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.umesh.indra.presentation.home.MainScreen
import com.umesh.indra.presentation.viewmodel.WeatherViewModel
import com.umesh.indra.ui.theme.IndraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IndraTheme {
                val viewModel: WeatherViewModel =
                    viewModel()

                MainScreen(
                    viewModel = viewModel
                )
            }
        }
    }
}
