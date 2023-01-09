package com.example.livpart2.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun Settings(
) {
    Column(modifier = Modifier.fillMaxSize().padding(all = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {
        Text(text = "Settings",
            color = MaterialTheme.colors.background, fontSize = 20.sp, fontWeight = FontWeight.Bold
        )

        Button(onClick = { /*TODO*/ }, modifier = Modifier.width(300.dp)) {
            Text(text = "Wearable Connection", color = Color.White)
        }

        Button(onClick = { /*TODO*/ }, modifier = Modifier.width(300.dp)) {

            Text(text = "Integration Systems", color = Color.White)
        }

        Button(onClick = { /*TODO*/ }, modifier = Modifier.width(300.dp)) {
            Text(text = "Cardia Cam Settings", color = Color.White)
        }

        Button(onClick = { /*TODO*/ }, modifier = Modifier.width(300.dp)) {
            Text(text = "Notifications", color = Color.White)
        }

        Button(onClick = { /*TODO*/ }, modifier = Modifier.width(300.dp)) {
            Text(text = "Help Center", color = Color.White)
        }
    }
}