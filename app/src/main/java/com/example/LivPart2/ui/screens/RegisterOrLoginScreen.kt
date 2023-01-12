package com.example.LivPart2.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.LivPart2.R

import com.example.destinations.DailyActivityOverviewAppDestination
import com.example.destinations.LoginScreenDestination
import com.example.destinations.RegisterAppDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

//import com.example.livpart2.R

@Destination
@Composable
fun RegisterOrLoginApp(
    navigator: DestinationsNavigator,
    modifier: Modifier = Modifier
    ){
    Surface(modifier = modifier
        .fillMaxSize()){

        Column(modifier = Modifier.padding(24.dp).background(MaterialTheme.colorScheme.background),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LivLogo()

        }
        Column(modifier = Modifier.padding(top = 150.dp),
            verticalArrangement = Arrangement.Center,

            horizontalAlignment = Alignment.CenterHorizontally){
            Login(navigator)
            Register(navigator)
            AsGuest(navigator)

        }
    }
}

@Composable
fun LivLogo(){
    Image(
        painter = painterResource(R.drawable.livlogo1),
        contentDescription = "Liv Logo",
        modifier = Modifier
            .size(256.dp)
            .background(color = Color.White)
    )
}



@Composable
fun Login(navigator: DestinationsNavigator){
    Button(onClick = {
        navigator.navigate(
            LoginScreenDestination
        )
    },
        colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
    ) {

        Text("Log in")
    }

}


@Composable
fun Register(navigator: DestinationsNavigator){
    Button(onClick = {
        navigator.navigate(
            RegisterAppDestination
        )
    },
        colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
    ) {
        Text("Register")
    }
}

@Composable
fun AsGuest(navigator: DestinationsNavigator){
    Button(onClick = {
        navigator.navigate(
                DailyActivityOverviewAppDestination
        )
    },
        colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
    ) {
        Text("Continue as guest")

    }
}

