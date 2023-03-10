package com.example.LivPart2.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
// import androidx.compose.material.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.destinations.DailyActivityOverviewAppDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination
@Composable
fun LoginScreen(
    navigator: DestinationsNavigator,
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
            Header()
        }

        Column(modifier = Modifier.padding(bottom = 100.dp),
            verticalArrangement = Arrangement.Center,

            horizontalAlignment = Alignment.CenterHorizontally) {
            Username1()
            Password1()
            ForgotUsername(navigator)
            CreateUser()
            Press1(navigator)
        }
    }

}

/*
Text input created following guide
https://developer.android.com/jetpack/compose/text
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Username1() {
    var mail by remember { mutableStateOf("") }

    TextField(
        value = mail,
        singleLine = true,
        onValueChange = { mail = it },
        label = { Text("Username") }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Password1() {
    var password by remember {
        mutableStateOf((""))
    }
    TextField(value = password, onValueChange = { password = it }, singleLine = true,
        label = { Text("Password") })

}

@Composable
fun Header() {
    Text(text = "Login", fontSize = 36.sp)
}

@Composable
fun ForgotUsername(navigator: DestinationsNavigator) {
    ClickableText(
        onClick = {navigator.navigate(
            //TODO: Make screen
            ""
        )},
        text = AnnotatedString("Forgot Password or Username?"),
        style = TextStyle(textDecoration = TextDecoration.Underline))
}

@Composable
fun CreateUser() {
    ClickableText(onClick = {},
        text = AnnotatedString("Create User"),
        style = TextStyle(textDecoration = TextDecoration.Underline))
}

/*
Following button created using guide
https://dev.to/manojbhadane/android-login-screen-using-jetpack-compose-part-1-50pl
 */
@Composable
fun Press1(navigator: DestinationsNavigator) {
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
        Text(text = "Login")
    }
}

@Composable
fun Back1(navigator: DestinationsNavigator) {
    Button(
        onClick = { navigator.navigateUp()},
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