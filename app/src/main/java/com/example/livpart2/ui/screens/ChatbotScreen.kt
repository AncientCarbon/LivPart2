package com.example.livpart2.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun ChatBotApp(navigator: DestinationsNavigator, modifier: Modifier = Modifier) {
    Surface(modifier = modifier
        .fillMaxSize()) {
        Column(
            modifier = Modifier
                .padding()
                .background(MaterialTheme.colors.background),
            verticalArrangement = Arrangement.Top
        ) {
        }
        Column(modifier = Modifier
            .padding(24.dp)
            .background(MaterialTheme.colors.background),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

        }
        Row(modifier = Modifier.padding(),
            verticalAlignment = Alignment.Bottom) {

            EnterText()
            SendButton()

        }
        BotNav(navigator)
    }

}

@Composable
fun EnterText() {
    var text by remember {
        mutableStateOf("")
    }
    TextField(value = text,
        onValueChange = { text = it },
        label = { Text("Enter text here") },
        modifier = Modifier.width(335.dp))
}

@Composable
fun SendButton(){
    Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)) {
        Text(text = "Register")
    }
}

