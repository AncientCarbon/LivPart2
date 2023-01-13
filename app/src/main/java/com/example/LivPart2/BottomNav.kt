package com.example.livpart2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BottomNav(modifier: Modifier = Modifier) {
    Surface(modifier = modifier
            .fillMaxSize()) {
        Column(
                modifier = Modifier
                        .padding(24.dp)
                        .background(MaterialTheme.colors.background),
                verticalArrangement = Arrangement.Bottom,
        ) {
            ChatbotButton()
        }


    }

}

@Composable
fun ChatbotButton(){
    Button(
            onClick = { },
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier
                    .padding(top = 24.dp)
                    .width(50.dp)
                    .height(75.dp)
    ) {
        Text(text = "Chat")
    }
}


