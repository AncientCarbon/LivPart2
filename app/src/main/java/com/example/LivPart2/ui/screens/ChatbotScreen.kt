package com.example.LivPart2.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.unit.sp
import com.example.LivPart2.ui.theme.md_theme_light_primary
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun ChatBotApp(navigator: DestinationsNavigator, modifier: Modifier = Modifier) {
    Surface(modifier = modifier
            .fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top) {

            Column(modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .fillMaxWidth()){

            }

            Column(modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.Start
            ) {
                Column(modifier=Modifier.padding(start = 10.dp), horizontalAlignment = Alignment.Start
                ) {
                    Heart()
                    Assist()
                }



                Column(modifier = Modifier
                        .padding(2.dp)
                        .padding(start = 5.dp),
                        horizontalAlignment = Alignment.Start
                ){
                    Sleep()
                    Weight()
                    Mentality()

                }
                Row(modifier = Modifier.padding(2.dp),
                        verticalAlignment = Alignment.Bottom) {
                    EnterText()
                    SendButton()


                }
                BotNav(navigator)


            }
        }


    }

}
@Composable
fun Heart(){
    Icon(Icons.Filled.QuestionAnswer, contentDescription = "ChatIcon")
}




@Composable
fun Assist(){
    Text(text = "Hi, I'm Liv, your health assistant", fontSize = 16.sp)
    Text(text = "What can I help you with?", fontSize = 16.sp)

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EnterText() {
    var text by remember {
        mutableStateOf("")
    }
    TextField(value = text,
            onValueChange = { text = it },
            label = { Text("Enter text here") },
            singleLine = true,
            modifier = Modifier.width(335.dp))
}

@Composable
fun SendButton(){
    IconButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Filled.Send, contentDescription = "Send")
    }
}


/*
    Implementation of buttons with icons made following the guide
    https://developer.android.com/jetpack/compose/layouts/material
 */
@Composable
fun Sleep(){

    Button(
            onClick = { /* ... */ },
            // Uses ButtonDefaults.ContentPadding by default
            contentPadding = PaddingValues(
                    start = 20.dp,
                    top = 12.dp,
                    end = 20.dp,
                    bottom = 12.dp
            ),
    ) {
        // Inner content including an icon and a text label
        Icon(
                Icons.Filled.Snooze,
                contentDescription = "Favorite",
                modifier = Modifier.size(ButtonDefaults.IconSize)
        )
        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        Text("How can I improve my sleep?")
    }
}

@Composable
fun Mentality(){
    Button(
            onClick = { /* ... */ },
            // Uses ButtonDefaults.ContentPadding by default
            contentPadding = PaddingValues(
                    start = 20.dp,
                    top = 12.dp,
                    end = 20.dp,
                    bottom = 12.dp
            )
    ) {
        // Inner content including an icon and a text label
        Icon(
                Icons.Filled.HeartBroken,
                contentDescription = "NotWell",
                modifier = Modifier.size(ButtonDefaults.IconSize)
        )
        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        Text("I feel stressed")
    }
}

@Composable
fun Weight(){
    Button(
            onClick = { /* ... */ },
            // Uses ButtonDefaults.ContentPadding by default
            contentPadding = PaddingValues(
                    start = 20.dp,
                    top = 12.dp,
                    end = 20.dp,
                    bottom = 12.dp
            )
    ) {
        // Inner content including an icon and a text label
        Icon(
                Icons.Filled.SportsGymnastics,
                contentDescription = "Weight",
                modifier = Modifier.size(ButtonDefaults.IconSize)
        )
        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        Text("How do I lose weight?")
    }
}