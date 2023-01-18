package com.example.LivPart2.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Facebook
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.LivPart2.destinations.DailyActivityOverviewAppDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination
@Composable
fun RegisterApp(navigator: DestinationsNavigator,
                modifier: Modifier = Modifier
) {
    Surface(modifier = modifier
            .fillMaxSize()) {
        Column(
                modifier = Modifier
                        .padding(24.dp)
                        .background(MaterialTheme.colorScheme.background),
                verticalArrangement = Arrangement.Top,
        ) {
            Back1(navigator)
        }
        Column(modifier = Modifier
                .padding(100.dp)
                .background(MaterialTheme.colorScheme.background),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SignUp()
        }
        Column(modifier = Modifier.padding(bottom = 100.dp),
                verticalArrangement = Arrangement.Center,

                horizontalAlignment = Alignment.CenterHorizontally) {
            Username()
            Password()
            RegisterButton(navigator)
            Row(horizontalArrangement = Arrangement.SpaceAround,
                    ) {
                Google()
                Facebook()
            }
        }

    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Username() {
    var text by remember {
        mutableStateOf("")
    }
    TextField(value = text,
            onValueChange = { text = it },
            singleLine = true,
            label = { Text("Username") })
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Password() {
    var text by remember {
        mutableStateOf("")
    }
    TextField(value = text,
            singleLine = true,
            onValueChange = { text = it },
            label = { Text("Password") })
}


@Composable
fun RegisterButton(navigator: DestinationsNavigator) {
    Button( //Add if statement for this on click
            onClick = { navigator.navigate(
                    DailyActivityOverviewAppDestination,
            )},
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier
                    .padding(top = 24.dp)
                    .width(150.dp)
                    .height(50.dp)
    ) {
        Text(text = "Register")
    }
}


@Composable
fun Google() {
    IconButton(onClick = {
        //direct to register or 3rd party registration screen
    }){
        Icon( Icons.Filled.Mail , contentDescription = "Google", modifier = Modifier.size(40.dp))
    }

}

@Composable
fun SignUp() {
    Text(text = "Sign up", fontSize = 36.sp)
}

@Composable
fun Facebook() {
    IconButton(onClick = {
        //direct to register or 3rd party registration screen
    }){
        Icon( Icons.Filled.Facebook , contentDescription = "Facebook", modifier = Modifier.size(40.dp))
    }
}

