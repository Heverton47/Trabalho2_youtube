package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            MyApplicationTheme {



                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    PerfilScreen()

                }
            }
        }
    }
}


@Composable
fun PerfilScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        // =========================
        // CONTEÚDO PRINCIPAL
        // =========================

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(horizontal = 14.dp)
        ) {

            Spacer(
                modifier = Modifier.height(15.dp)
            )


            // =========================
            // BLOCO PEQUENO SUPERIOR
            // =========================

            Box(
                modifier = Modifier
                    .width(45.dp)
                    .height(14.dp)
                    .background(
                        Color.LightGray,
                        RoundedCornerShape(10.dp)
                    )
            )


            Spacer(
                modifier = Modifier.height(18.dp)
            )


            // =========================
            // FOTO / PERFIL
            // =========================

            Box(
                modifier = Modifier
                    .size(55.dp)
                    .background(
                        Color.LightGray,
                        CircleShape
                    )
            )


            Spacer(
                modifier = Modifier.height(25.dp)
            )


            // =========================
            // DOIS BLOCOS HORIZONTAIS
            // =========================

            Row(
                modifier = Modifier.fillMaxWidth(),

                horizontalArrangement = Arrangement.spacedBy(25.dp)
            ) {

                Box(
                    modifier = Modifier
                        .width(100.dp)
                        .height(30.dp)
                        .background(
                            Color.LightGray,
                            RoundedCornerShape(7.dp)
                        )
                )

                Box(
                    modifier = Modifier
                        .width(100.dp)
                        .height(30.dp)
                        .background(
                            Color.LightGray,
                            RoundedCornerShape(7.dp)
                        )
                )
            }


            Spacer(
                modifier = Modifier.height(35.dp)
            )


            // =========================
            // TRÊS BLOCOS GRANDES
            // =========================

            Row(
                modifier = Modifier.fillMaxWidth(),

                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(85.dp)
                        .background(Color.LightGray)
                )

                Spacer(
                    modifier = Modifier.width(20.dp)
                )

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(85.dp)
                        .background(Color.LightGray)
                )

                Spacer(
                    modifier = Modifier.width(20.dp)
                )

                Box(
                    modifier = Modifier
                        .width(40.dp)
                        .height(85.dp)
                        .background(Color.LightGray)
                )
            }


            Spacer(
                modifier = Modifier.height(28.dp)
            )


            // =========================
            // TRÊS BLOCOS MENORES
            // =========================

            Row(
                modifier = Modifier.fillMaxWidth(),

                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(27.dp)
                        .background(Color.LightGray)
                )

                Spacer(
                    modifier = Modifier.width(20.dp)
                )

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(27.dp)
                        .background(Color.LightGray)
                )

                Spacer(
                    modifier = Modifier.width(20.dp)
                )

                Box(
                    modifier = Modifier
                        .width(40.dp)
                        .height(27.dp)
                        .background(Color.LightGray)
                )
            }


            Spacer(
                modifier = Modifier.height(18.dp)
            )


            // =========================
            // PRIMEIRO CARD
            // ================== =======

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(95.dp)
                    .border(
                        width = 6.dp,
                        color = Color.DarkGray,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(7.dp),

                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(
                            Color.LightGray,
                            RoundedCornerShape(5.dp)
                        )
                )

                Box(
                    modifier = Modifier
                        .weight(1.6f)
                        .fillMaxHeight()
                        .background(
                            Color.LightGray,
                            RoundedCornerShape(5.dp)
                        )
                )
            }


            Spacer(
                modifier = Modifier.height(14.dp)
            )


            // =========================
            // SEGUNDO CARD
            // =========================

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(95.dp)
                    .border(
                        width = 6.dp,
                        color = Color.DarkGray,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(7.dp),

                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(
                            Color.LightGray,
                            RoundedCornerShape(5.dp)
                        )
                )

                Box(
                    modifier = Modifier
                        .weight(1.6f)
                        .fillMaxHeight()
                        .background(
                            Color.LightGray,
                            RoundedCornerShape(5.dp)
                        )
                )
            }
        }


        // =========================
        // RODAPÉ
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


// =========================
// PREVIEW
// =========================

@Preview(showBackground = true)
@Composable
fun PerfilScreenPreview() {

    MyApplicationTheme {

        PerfilScreen()

    }
}