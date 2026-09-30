package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme



@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        // =========================
        // CABEÇALHO
        // =========================

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),

            horizontalArrangement = Arrangement.SpaceBetween,

            verticalAlignment = Alignment.CenterVertically
        ) {

            // Foto/perfil

            Box(
                modifier = Modifier
                    .size(45.dp)
                    .background(
                        Color.LightGray,
                        CircleShape
                    )
            )


            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(
                            Color.LightGray,
                            CircleShape
                        )
                )

                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(
                            Color.LightGray,
                            CircleShape
                        )
                )

                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(
                            Color.LightGray,
                            CircleShape
                        )
                )
            }
        }


        // =========================
        // MENU SUPERIOR
        // =========================

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp),

            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            repeat(4) {

                Box(
                    modifier = Modifier
                        .width(80.dp)
                        .height(40.dp)
                        .background(
                            Color.LightGray,
                            RoundedCornerShape(8.dp)
                        )
                )
            }
        }


        Spacer(
            modifier = Modifier.height(25.dp)
        )


        // =========================
        // PRIMEIRO CARD
        // =========================

        CardHome()


        Spacer(
            modifier = Modifier.height(20.dp)
        )


        // =========================
        // SEGUNDO CARD
        // =========================

        CardHome()


        Spacer(
            modifier = Modifier.weight(1f)
        )


        // =========================
        // BARRA INFERIOR
        // =========================

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .background(Color.Gray),

            horizontalArrangement = Arrangement.SpaceEvenly,

            verticalAlignment = Alignment.CenterVertically
        ) {

            repeat(5) {

                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(
                            Color.LightGray,
                            CircleShape
                        )
                )
            }
        }
    }
}


// ======================================
// CARD DA HOME
// ======================================

@Composable
fun CardHome() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
            .background(
                Color.LightGray,
                RoundedCornerShape(12.dp)
            )
    ) {

        // Área da imagem

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
                .background(
                    Color.Gray,
                    RoundedCornerShape(12.dp)
                )
        )


        // Botões do card

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Box(
                modifier = Modifier
                    .size(35.dp)
                    .background(
                        Color.White,
                        CircleShape
                    )
            )
            Column {
                Surface {
                    Box(
                        modifier = Modifier
                            .size(150.dp, 10.dp)
                            .background(Color.White)
                    )


                }
            }



            Column {


                Box(
                    modifier = Modifier
                        .size(7.dp)
                        .background(
                            Color.White,
                            CircleShape

                        )
                )
                Box(
                    modifier = Modifier
                        .size(7.dp)
                        .background(
                            Color.White,
                            CircleShape
                        )
                )

                Box(
                    modifier = Modifier
                        .size(7.dp)
                        .background(
                            Color.White,
                            CircleShape
                        )
                )

            }
        }
    }
}


// ======================================
// PREVIEW
// ======================================

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {

    MyApplicationTheme {

        HomeScreen()

    }
}