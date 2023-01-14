package com.example.LivPart2.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.LivPart2.destinations.RegisterOrLoginAppDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination
@Composable
fun ProfileApp(navigator: DestinationsNavigator, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .fillMaxSize()
    ) {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.background),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ProfileHeader()

            }
            BotNav(navigator)
        }

    }

}
/*
Alot of this code is not needed in the final prduct, although some methods should be called
in the edit profile screen
 */


@Composable
fun Birthday() {
    Text(text = "2001/02/09")
}

@Composable
fun ProfileGender() {
    Text(text = "Male")
}

@Composable
fun ProfileHeight() {
    Text(text = "192 cm")
}

@Composable
fun ProfileWeight() {
    Text(text = "93.5kg")
}

@Composable
fun LogOutButton(navigator: DestinationsNavigator) {
    Button(
        onClick = { navigator.navigate(RegisterOrLoginAppDestination) },
        shape = RoundedCornerShape(50.dp),
        modifier = Modifier
            .padding(top = 24.dp)
            .width(150.dp)
            .height(50.dp)
    ) {
        Text(text = "Log out")
    }
}

@Composable
fun ProfileHeader() {
    Text(text = "Magnus Bruus", fontSize = 36.sp)
}

