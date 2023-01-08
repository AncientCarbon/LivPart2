package com.example.livpart2.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun LoginApp() {
    LoginScreen()
}

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Surface(modifier = modifier
        .fillMaxSize()) {
        Column(
            modifier = Modifier
                .padding(24.dp)
                .background(MaterialTheme.colors.background),
            verticalArrangement = Arrangement.Top,
        ) {
            Back1()
        }
        Column(modifier = Modifier
            .padding(100.dp)
            .background(MaterialTheme.colors.background),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Header()
        }

        Column(modifier = Modifier.padding(bottom = 100.dp),
            verticalArrangement = Arrangement.Center,

            horizontalAlignment = Alignment.CenterHorizontally) {
            Username1()
            Password1()
            ForgotUsername()
            CreateUser()
            Press1()
        }
    }

}

/*
Text input created following guide
https://developer.android.com/jetpack/compose/text
 */

@Composable
fun Username1() {
    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Username") }
    )
}

@Composable
fun Password1() {
    var text1 by remember {
        mutableStateOf((""))
    }
    TextField(value = text1, onValueChange = { text1 = it },
        label = { Text("Password") })

}

@Composable
fun Header() {
    Text(text = "Login", fontSize = 36.sp)
}

@Composable
fun ForgotUsername() {
    ClickableText(onClick = {}, text = AnnotatedString("Forgot Password or Username?"), style = TextStyle(textDecoration = TextDecoration.Underline))
}

@Composable
fun CreateUser() {
    ClickableText(onClick = {}, text = AnnotatedString("Create User"), style = TextStyle(textDecoration = TextDecoration.Underline))
}

/*
Following button created using guide
https://dev.to/manojbhadane/android-login-screen-using-jetpack-compose-part-1-50pl
 */
@Composable
fun Press1() {
    Button(
        onClick = { },
        shape = RoundedCornerShape(50.dp),
        modifier = Modifier
            .padding(top = 24.dp)
            .width(150.dp)
            .height(50.dp)
    ) {
        Text(text = "Login")
    }
}

@Composable
fun Back1() {
    Button(
        onClick = { },
        shape = RoundedCornerShape(50.dp),
        modifier = Modifier
            .padding(bottom = 150.dp)
            .padding()

            .width(100.dp)
            .height(35.dp)
    ) {
        Text(text = "Back")
    }
}