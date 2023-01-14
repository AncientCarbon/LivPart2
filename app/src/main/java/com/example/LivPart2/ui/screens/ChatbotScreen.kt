package com.example.LivPart2.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun ChatBotApp(navigator: DestinationsNavigator, modifier: Modifier = Modifier) {
    Surface(modifier = modifier
        .fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top) {
            Column(modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
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
    Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)) {
        Text(text = "Register")
    }
}

