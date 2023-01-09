package com.example.livpart2.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination


@Destination
@Composable
fun RegisterApp(
    modifier: Modifier = Modifier
    ) {
    Surface(modifier = modifier
        .fillMaxSize()) {
        Column(
            modifier = Modifier
                .padding()
                .background(MaterialTheme.colors.background),
            verticalArrangement = Arrangement.Top,
        ) {
            Back()
        }
        Column(modifier = Modifier
            .padding(24.dp)
            .background(MaterialTheme.colors.background),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SignUp()
            Username()
            Password()
            Press()
        }
        Column(modifier = Modifier.padding(top = 200.dp),
            verticalArrangement = Arrangement.Center,

            horizontalAlignment = Alignment.CenterHorizontally) {

            Google()
            Facebook()


        }
    }

}

@Composable
fun Username() {
    var text by remember {
        mutableStateOf("")
    }
    TextField(value = text,
        onValueChange = { text = it },
        label = { Text("Username") })
}

@Composable
fun Password() {
    var text by remember {
        mutableStateOf("")
    }
    TextField(value = text,
        onValueChange = { text = it },
        label = { Text("Password") })
}


@Composable
fun Press() {
    Button(onClick = { /*TODO*/ },
        shape = RoundedCornerShape(50.dp),
        modifier = Modifier
            .padding(top = 20.dp)
            .width(150.dp)
            .height(50.dp)) {
        Text(text = "Register")
    }
}


@Composable
fun Google() {
    Button(onClick = {

        // direct to login screen
    },
        shape = RoundedCornerShape(50.dp),

        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
    ) {

        Text("Sign up with Google")
    }

}

@Composable
fun SignUp() {
    Text(text = "Sign up",
        Modifier
            .padding(48.dp)
            .padding(top = 50.dp), fontSize = 35.sp)
}

@Composable
fun Facebook() {
    Button(onClick = {
        //direct to register or 3rd party registration screen
    },
        shape = RoundedCornerShape(50.dp),

        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
    ) {
        Text("Sign up with Facebook")
    }
}

@Composable
fun Back() {
    Button(onClick = { /*TODO*/ },
        shape = RoundedCornerShape(50.dp),
        modifier = Modifier
            .padding(bottom = 150.dp)
            .width(100.dp)
            .height(35.dp)
    ) {
        Text(text = "Back")
    }
}


