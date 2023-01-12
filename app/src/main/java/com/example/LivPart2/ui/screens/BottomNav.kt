package com.example.LivPart2.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.LivPart2.destinations.*
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Composable
fun BotNav(navigator: DestinationsNavigator){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 10.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceAround

    ) {
        ChatbotButton(navigator)
        DashboardButton(navigator)
        DailyActivityButton(navigator)

    }
}

@Composable
fun TopNav(navigator: DestinationsNavigator){
    Row( modifier = Modifier.fillMaxWidth() ,verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.SpaceBetween) {
        SettingsButton(navigator)
        ProfileButton(navigator)
    }


}

@Composable
fun ChatbotButton(navigator: DestinationsNavigator){
    Button(
        onClick = { navigator.navigate(
            ChatBotAppDestination
        )},
        shape = RoundedCornerShape(50.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan),
        modifier = Modifier
            .padding(top = 24.dp)
            .width(50.dp)
            .height(50.dp)
    ) {
        Text(text = "Chat")
    }
}


@Composable
fun DashboardButton(navigator: DestinationsNavigator){
    Button(
        onClick = { navigator.navigate(
            DashboardAppDestination
        )},
        shape = RoundedCornerShape(50.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan),

        modifier = Modifier
            .padding(top = 24.dp)
            .width(50.dp)
            .height(50.dp)
    ) {
        Text(text = "Dash")
    }
}

@Composable
fun DailyActivityButton(navigator: DestinationsNavigator){
    Button(
        onClick = {navigator.navigate(
            DailyActivityOverviewAppDestination
        )
         },
        shape = RoundedCornerShape(50.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan),

        modifier = Modifier
            .padding(top = 24.dp)
            .width(50.dp)
            .height(50.dp)
    ) {
        Text(text = "Act")
    }
}

@Composable
fun ProfileButton(navigator: DestinationsNavigator){
    Button(
        onClick = { navigator.navigate(
            ProfileAppDestination
        ) },
        shape = RoundedCornerShape(50.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan),

        modifier = Modifier
            .padding(top = 24.dp)
            .width(50.dp)
            .height(50.dp)
    ) {
        Text(text = "you")
    }
}

@Composable
fun SettingsButton(navigator: DestinationsNavigator){
    Button(
        onClick = {navigator.navigate(
            SettingsDestination
        ) },
        shape = RoundedCornerShape(50.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan),

        modifier = Modifier
            .padding(top = 24.dp)
            .width(50.dp)
            .height(50.dp)
    ) {
        Text(text = "Sett")
    }
}



