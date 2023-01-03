package com.example.livpart2

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.livpart2.ui.theme.Background
import com.example.livpart2.ui.theme.LivPart2Theme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LivPart2Theme() {
                MyApp(modifier = Modifier.fillMaxSize())// A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Background
                ) {
                    MyApp()
                }
            }
        }
    }

}



@Preview(showBackground = true)
@Composable
fun MyApp(modifier: Modifier = Modifier){
    Surface(modifier = modifier){
        Column(modifier = Modifier.padding(24.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally){
            LivLogo()
            Login()
            Register()

        }
    }

}

@Composable
fun LivLogo(){
    //Image(source = "LIV/app/src/main/res/Pictures/Liv-logo-500x500.png")
}


@Composable
fun Login(){
    Button(onClick = {
        // direct to login screen
    }) {
        Text("Log in")
    }

}


@Composable
fun Register(){
    Button(onClick = {
        //direct to register or 3rd party registration screen
    }) {
        Text("Register")
    }
}

@Composable
fun AsGuest(){
    Button(onClick = {

    }) {
        Text("Continue as guest")
    }
}