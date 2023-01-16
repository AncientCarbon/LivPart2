package com.example.LivPart2.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Snooze
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Assist()
                Row(modifier = Modifier.padding(2.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    Attempt()

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
fun ChatBotFigure(){

}

@Composable
fun Assist(){
    Text(text = "How may I be of assist for you?", fontSize = 24.sp)
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
        Icon(Icons.Filled.Send, contentDescription = "SendButton")
    }
}


/*
    Implementation of following button made following the guide
    https://developer.android.com/jetpack/compose/layouts/material
 */
@Composable
fun Attempt(){
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
            Icons.Filled.Snooze,
            contentDescription = "Favorite",
            modifier = Modifier.size(ButtonDefaults.IconSize)
        )
        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        Text("How can I improve my sleep?")
    }
}