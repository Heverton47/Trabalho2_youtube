package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
@Preview
fun TelaCanal(  ) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(173, 173, 173, 255),
        shape = RoundedCornerShape(20.dp)
    ){
        Column {
            /*Começo 1º trecho*/
            Cabecalho()
            /*Fim 1º trecho*/

            Spacer(modifier = Modifier.padding(4.dp))

            /*Começo 2º trecho*/
            Inicio()
            /*Fim 2º trecho*/

            Spacer(modifier = Modifier.padding(8.dp))

            /*Começo 3º trecho*/
            Canal()
            /*Fim 3º trecho*/

            Spacer(modifier = Modifier.padding(4.dp))

            /*Começo 4º trecho*/
            Descricao()
            /*Fim 4º trecho*/

            Spacer(modifier = Modifier.padding(12.dp))

            Column(
                Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                /*Começo 5º trecho*/
                Inscreva_se()

                Spacer(modifier = Modifier.padding(8.dp))

                Paginas()
                /*Fim 5º trecho*/

                Spacer(modifier = Modifier.padding(12.dp))

                /*Começo 6º trecho(provavelmente vai entrar como função no 5º trecho)*/
                Filtro_Video()
                /*Fim 6º trecho*/

                Spacer(modifier = Modifier.padding(16.dp))

                /*Começo 7º trecho(provavelmente vai entrar como função no 5º trecho)*/

                Video()
            }
            /*Fim 7º trecho*/
            Spacer(modifier = Modifier.padding(20.dp))
            Spacer(modifier = Modifier.padding(20.dp))
            /*Começo rodapé*/
            Rodape()
            /*Fim rodapé*/
        }
    }
}

@Composable
private fun Rodape() {
    Row(
        Modifier
            .height(70.dp)
            .fillMaxWidth()
            .background(Color.Gray),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,

        ) {
        Surface(
            modifier = Modifier.size(40.dp),
            color = Color.Black,
            shape = RoundedCornerShape(50.dp)
        ) {}
        Surface(
            modifier = Modifier.size(40.dp),
            color = Color.Black,
            shape = RoundedCornerShape(50.dp)
        ) {}
        Surface(
            modifier = Modifier.size(40.dp),
            color = Color.Black,
            shape = RoundedCornerShape(50.dp)
        ) {}
        Surface(
            modifier = Modifier.size(40.dp),
            color = Color.Black,
            shape = RoundedCornerShape(50.dp)
        ) {}
        Surface(
            modifier = Modifier.size(40.dp),
            color = Color.Black,
            shape = RoundedCornerShape(50.dp)
        ) {}
    }
}

@Composable
private fun Video() {
    Row(
        modifier = Modifier.size(350.dp, 140.dp),
        horizontalArrangement = Arrangement.SpaceBetween
        //verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Surface(
                modifier = Modifier.size(220.dp, 140.dp),
                color = Color.Black,
                shape = RoundedCornerShape(20.dp)
            ) {
            }
        }
        Column {
            Row {
                Surface(
                    modifier = Modifier
                        .size(110.dp, 25.dp)
                        .padding(4.dp),
                    color = Color.Gray,
                    shape = RoundedCornerShape(10.dp)
                ) {Row(horizontalArrangement = Arrangement.Center) { Text(text = "Título") }}
            }

            Row {
                Surface(
                    modifier = Modifier
                        .size(110.dp, 25.dp)
                        .padding(4.dp),
                    color = Color.Gray,
                    shape = RoundedCornerShape(10.dp)
                ) {Row(horizontalArrangement = Arrangement.Center) { Text(text = "642 mil views") }}
            }
            Row {
                Surface(
                    modifier = Modifier
                        .size(110.dp, 25.dp)
                        .padding(4.dp),
                    color = Color.Gray,
                    shape = RoundedCornerShape(10.dp)
                ) {Row(horizontalArrangement = Arrangement.Center) { Text(text = "há 1 dia") }}
            }
        }
        Column {
            Surface(
                modifier = Modifier.size(15.dp, 25.dp),
                color = Color.Gray,
                shape = RoundedCornerShape(10.dp)
            ) {}
        }
    }
}

@Composable
private fun Filtro_Video() {
    Row(
        modifier = Modifier.size(350.dp, 40.dp)
    ) {
        Surface(
            modifier = Modifier
                .size(100.dp, 30.dp)
                .padding(2.dp),
            color = Color.Gray,
            shape = RoundedCornerShape(10.dp)
        ) {Row(horizontalArrangement = Arrangement.Center) { Text(text = "Mais Recentes") }}
        Surface(
            modifier = Modifier
                .size(100.dp, 30.dp)
                .padding(2.dp),
            color = Color.Gray,
            shape = RoundedCornerShape(10.dp)
        ) {Row(horizontalArrangement = Arrangement.Center) { Text(text = "Em alta") }}
        Surface(
            modifier = Modifier
                .size(100.dp, 30.dp)
                .padding(2.dp),
            color = Color.Gray,
            shape = RoundedCornerShape(10.dp)
        ) {Row(horizontalArrangement = Arrangement.Center) { Text(text = "Mais antigos") }}
    }
}

@Composable
private fun Inscreva_se() {
    Row() {
        Surface(
            modifier = Modifier.size(350.dp, 40.dp),
            color = Color.Gray,
            shape = RoundedCornerShape(10.dp)
        ) {Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) { Text(text = "Inscreva-se") }}
    }
}

@Composable
private fun Paginas() {
    Row(
        modifier = Modifier.size(350.dp, 60.dp)
    ) {
        Surface(
            modifier = Modifier
                .size(70.dp, 30.dp)
                .padding(2.dp),
            color = Color.Gray,
            shape = RoundedCornerShape(10.dp)
        ) { Row(horizontalArrangement = Arrangement.Center) { Text(text = "Início") } }
        Surface(
            modifier = Modifier
                .size(70.dp, 30.dp)
                .padding(2.dp),
            color = Color.Gray,
            shape = RoundedCornerShape(10.dp)
        ) {Row(horizontalArrangement = Arrangement.Center) { Text(text = "Vídeos") }}
        Surface(
            modifier = Modifier
                .size(70.dp, 30.dp)
                .padding(2.dp),
            color = Color.Gray,
            shape = RoundedCornerShape(10.dp)
        ) {Row(horizontalArrangement = Arrangement.Center) { Text(text = "Playlists") }}
        Surface(
            modifier = Modifier
                .size(70.dp, 30.dp)
                .padding(2.dp),
            color = Color.Gray,
            shape = RoundedCornerShape(10.dp)
        ) {Row(horizontalArrangement = Arrangement.Center) { Text(text = "Posts") }}
        Surface(
            modifier = Modifier
                .size(70.dp, 30.dp)
                .padding(2.dp),
            color = Color.Gray,
            shape = RoundedCornerShape(10.dp)
        ) {Row(horizontalArrangement = Arrangement.Center) { Text(text = "Loja") }}
    }
}

@Composable
private fun Descricao() {
    Row {
        Surface(
            modifier = Modifier
                .size(120.dp, 20.dp)
                .padding(2.dp),
            color = Color.Gray,
            shape = RoundedCornerShape(10.dp)
        ) {Row(horizontalArrangement = Arrangement.Center) { Text(text = "Descrição") }}
    }
    Row {
        Surface(
            modifier = Modifier
                .size(120.dp, 20.dp)
                .padding(2.dp),
            color = Color.Gray,
            shape = RoundedCornerShape(10.dp)
        ) {Row(horizontalArrangement = Arrangement.Center) { Text(text = "Mais Descrição") }}
    }
}

@Composable
private fun Canal() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Surface(
                modifier = Modifier.size(60.dp),
                color = Color.Black,
                shape = RoundedCornerShape(50.dp)
            ) {
            }
        }
        Column {
            Row {
                Surface(
                    modifier = Modifier
                        .size(140.dp, 30.dp)
                        .padding(4.dp),
                    color = Color.Gray,
                    shape = RoundedCornerShape(10.dp)
                ) {Row(horizontalArrangement = Arrangement.Center) { Text(text = "CanalGenerico!!!") }}
            }

            Row {
                Surface(
                    modifier = Modifier
                        .size(120.dp, 25.dp)
                        .padding(4.dp),
                    color = Color.Gray,
                    shape = RoundedCornerShape(10.dp)
                ) {Row(horizontalArrangement = Arrangement.Center) { Text(text = "@CanalGenerico") }}
            }
            Row {
                Surface(
                    modifier = Modifier
                        .size(120.dp, 25.dp)
                        .padding(4.dp),
                    color = Color.Gray,
                    shape = RoundedCornerShape(10.dp)
                ) {Row(horizontalArrangement = Arrangement.Center) { Text(text = "2,11 mi inscritos") }}
            }
        }
    }
}

@Composable
private fun Cabecalho() {
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Surface(
                modifier = Modifier.size(40.dp),
                color = Color.Black,
                shape = RoundedCornerShape(50.dp)
            ) {}
        }
        Column {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Surface(
                    modifier = Modifier.size(40.dp),
                    color = Color.Black,
                    shape = RoundedCornerShape(50.dp)
                ) {}

                Spacer(modifier = Modifier.padding(4.dp))

                Surface(
                    modifier = Modifier.size(20.dp, 40.dp),
                    color = Color.Black,
                    shape = RoundedCornerShape(10.dp)
                ) {}
                Spacer(modifier = Modifier.padding(4.dp))
            }

        }
    }
}

@Composable
private fun Inicio() {
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Surface(
            modifier = Modifier.size(380.dp, 140.dp),
            color = Color.Black,
            shape = RoundedCornerShape(10.dp)
        ) {}
    }
}