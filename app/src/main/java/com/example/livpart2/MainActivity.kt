package com.example.livpart2

import android.annotation.SuppressLint
import android.media.Image
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.livpart2.MyApp
import com.example.livpart2.R
import com.example.livpart2.ui.theme.Background
import com.example.livpart2.ui.theme.LivPart2Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
           MyApp()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyApp(modifier: Modifier = Modifier){
    Surface(modifier = modifier
        .fillMaxSize()){

        Column(modifier = Modifier
            .padding(24.dp)
            .background(MaterialTheme.colors.background),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Header()
        }
        Column(modifier = Modifier.padding(bottom = 100.dp),
            verticalArrangement = Arrangement.Center,

            horizontalAlignment = Alignment.CenterHorizontally){
            Username()
            Password()
        }
    }

}

/*
Text input created following guide
https://developer.android.com/jetpack/compose/text
 */
@Composable
fun Username() {
    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Username") }
    )
}

@Composable
fun Password(){
    var text1 by remember {
        mutableStateOf((""))
    }
        TextField(value = text1, onValueChange = {text1 = it},
        label = {Text("Password")})

    }

@Composable
fun Header(){
    Text(text = "Login", fontSize = 36.sp)
}
