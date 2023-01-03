package com.example.livpart2.Model

import android.annotation.SuppressLint
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.livpart2.MyApp
import com.example.livpart2.R
import com.example.livpart2.ui.theme.Background
import com.example.livpart2.ui.theme.LivPart2Theme

class FrontScreen : ComponentActivity() {

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
    Surface(modifier = modifier){
        Column(modifier = Modifier.padding(48.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally){
            LivLogo()
            Login()
            Register()
            AsGuest()

        }
    }

}

@Composable
fun LivLogo(){
    Image(
        painter = painterResource(R.mipmap.livlogos),
        contentDescription = "Liv Logo",
        modifier = Modifier
            .fillMaxSize()
            .size(128.dp)
    )
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

