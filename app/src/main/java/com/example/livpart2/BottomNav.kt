package com.example.livpart2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ChatbotButton(){
    Button(
            onClick = { },
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier
                .padding(top = 24.dp)
                .width(50.dp)
                .height(50.dp)
    ) {
        Text(text = "Chat")
    }
}


@Composable
fun DashboardButton(){
    Button(
        onClick = { },
        shape = RoundedCornerShape(50.dp),
        modifier = Modifier
            .padding(top = 24.dp)
            .width(50.dp)
            .height(50.dp)
    ) {
        Text(text = "Dash")
    }
}

@Composable
fun DailyActivityButton(){
    Button(
        onClick = { },
        shape = RoundedCornerShape(50.dp),
        modifier = Modifier
            .padding(top = 24.dp)
            .width(50.dp)
            .height(50.dp)
    ) {
        Text(text = "Act")
    }
}

@Composable
fun ProfileButton(){
    Button(
        onClick = { },
        shape = RoundedCornerShape(50.dp),
        modifier = Modifier
            .padding(top = 24.dp)
            .width(50.dp)
            .height(50.dp)
    ) {
        Text(text = "you")
    }
}

@Composable
fun SettingsButton(){
    Button(
        onClick = { },
        shape = RoundedCornerShape(50.dp),
        modifier = Modifier
            .padding(top = 24.dp)
            .width(50.dp)
            .height(50.dp)
    ) {
        Text(text = "Sett")
    }
}

