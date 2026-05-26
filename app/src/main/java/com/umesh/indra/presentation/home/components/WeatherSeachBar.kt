package com.umesh.indra.presentation.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.umesh.indra.R
import retrofit2.http.Query

@Composable
fun WeatherSearchBar(searchQuery: String, onQueryChange: (String) -> Unit, onSearch: () -> Unit) {
    val gradientColor = listOf<Color>(Color(0xFF1488CC),Color(0xFF2B32B2) )
    OutlinedTextField(
        value = searchQuery,
        onValueChange = onQueryChange ,
        placeholder = { Text("Search for city or country...") },
        leadingIcon = {
            Icon(
                painterResource(R.drawable.cloud),
                contentDescription = "CLOUD BUTTON",
                modifier = Modifier.size(24.dp),
                tint = Color.Unspecified
            )
        },
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White
//
//            focusedContainerColor = Color(0xFFE65C00),
//            unfocusedContainerColor = Color(0xFFF9D423),
        ),
        trailingIcon = {
            if (searchQuery.isNotEmpty()) {
                IconButton(onClick = { onQueryChange("")}) {
                    Icon(Icons.Default.Clear, contentDescription = "CLEAR BUTTON")
                }
            }else{
                IconButton(onClick = {}) {
                    Icon(Icons.Default.Search, contentDescription = "")
                }
            }
        },
        singleLine = true,
         shape = RoundedCornerShape(
           56.dp
        ),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
        keyboardActions = KeyboardActions(
            onSearch = {
                onSearch()
            }
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp, top = 28.dp)
    )


}