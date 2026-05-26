package com.umesh.indra.presentation.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.umesh.indra.ui.theme.fjallone

@Composable
fun WeatherHomeChip(
    tempMax: Double,
    tempMin: Double,
    description: String
) {
    Surface(modifier = Modifier.padding(vertical = 12.dp), shape = RoundedCornerShape(24.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(buildAnnotatedString {
                withStyle(SpanStyle(fontFamily = fjallone)) {
                    append("Max\n")
                }


                withStyle(SpanStyle()) {
                    append(
                        "${tempMax.toInt()} °"
                    )

                }
            })

            VerticalDivider(
                thickness = 1.dp,
                modifier = Modifier
                    .height(24.dp)
                    .padding(horizontal = 8.dp),
            )
            Text(buildAnnotatedString {
                withStyle(SpanStyle(fontFamily = fjallone)) {
                   append("Min\n")
                }

                withStyle(SpanStyle()) {
                    append(
                        "${tempMin.toInt()} °"
                    )

                }

                })
            VerticalDivider(
                thickness = 1.dp,
                modifier = Modifier
                    .height(24.dp)
                    .padding(horizontal = 8.dp),
            )
            Text(buildAnnotatedString {
                withStyle(SpanStyle(fontFamily = fjallone)) {
                    append("Description\n")
                }
                   append(
                        description
                    )


            })

        }
    }

}