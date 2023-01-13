package com.example.livpart2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.LivPart2.R


@Preview(showBackground = true)
@Composable
fun RegisterOrLoginApp(modifier: Modifier = Modifier){
    Surface(modifier = modifier
            .fillMaxSize()){

        Column(modifier = Modifier.padding(24.dp).background(MaterialTheme.colors.background),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LivLogo()

        }
        Column(modifier = Modifier.padding(top = 150.dp),
                verticalArrangement = Arrangement.Center,

                horizontalAlignment = Alignment.CenterHorizontally){
            Login()
            Register()
            AsGuest()

        }
    }

}

@Composable
fun LivLogo(){
    Image(
            painter = painterResource(R.drawable.liv1),
            contentDescription = "Liv Logo",
            modifier = Modifier
                    .size(256.dp)
                    .background(color = Color.White)
    )
}



@Composable
fun Login(){
    Button(onClick = {

        // direct to login screen
    },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
    ) {

        Text("Log in")
    }

}


@Composable
fun Register(){
    Button(onClick = {
        //direct to register or 3rd party registration screen
    },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
    ) {
        Text("Register")
    }
}

@Composable
fun AsGuest(){
    Button(onClick = {

    },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
    ) {
        Text("Continue as guest")

    }
}

