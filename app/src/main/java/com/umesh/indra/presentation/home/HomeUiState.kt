package com.umesh.indra.presentation.home

import com.umesh.indra.domain.model.Weather

data class HomeUiState(
    val isLoading: Boolean = false,
    val weather: Weather? = null,
    val error: String? = null
)