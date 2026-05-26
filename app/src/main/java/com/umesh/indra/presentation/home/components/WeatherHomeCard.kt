package com.umesh.indra.presentation.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.umesh.indra.R
import com.umesh.indra.ui.theme.fjallone

@Composable
fun WeatherHomeCard(windSpeed: Double, humidity: Int, visibility: Int, seaLevel: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        shape = RoundedCornerShape(24.dp),
        CardDefaults.cardColors(
            containerColor = Color.White
        ),

        ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalArrangement = Arrangement.Center

        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.wind),
                        contentDescription = "",
                        modifier = Modifier.size(24.dp)
                    )

                    Text(buildAnnotatedString {
                        withStyle(
                            SpanStyle(
                                color = Color.Gray,
                                fontFamily = fjallone,
                                fontSize = 20.sp
                            )
                        ) {
                            append("Wind\n")

                        }
                        append("${windSpeed.toInt()} km/h")

                    })
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.humidity),
                        contentDescription = "",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(24.dp)
                    )

                    Text(buildAnnotatedString {
                        withStyle(
                            SpanStyle(
                                color = Color.Gray,
                                fontFamily = fjallone,
                                fontSize = 20.sp
                            )
                        ) {
                            append("Humidity\n")
                        }
                        withStyle(SpanStyle(color = Color.Gray, fontFamily = fjallone)) {

                            append("$humidity")
                        }
                    })

                }
            }
            Spacer(modifier = Modifier.height(32.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.sea_level),
                        contentDescription = "",
                        modifier = Modifier.size(24.dp)
                    )
                    Text(buildAnnotatedString {
                        withStyle(
                            SpanStyle(
                                color = Color.Gray,
                                fontFamily = fjallone,
                                fontSize = 20.sp
                            )
                        ) {

                            append("Sea Level\n")
                        }
                        append("${seaLevel} hPa")
                    })

                }


                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.visibility),
                        contentDescription = "",
                        modifier = Modifier.size(24.dp)
                    )


                    Text(buildAnnotatedString {
                        withStyle(
                            SpanStyle(
                                color = Color.Gray,
                                fontFamily = fjallone,
                                fontSize = 20.sp
                            )
                        ) {

                            append("Visibility\n")
                        }
                        append("${visibility} m")
                    })
                }


            }


        }

    }
}




