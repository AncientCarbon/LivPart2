package com.example.LivPart2.ui.screens


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.LivPart2.destinations.ChatBotAppDestination
import com.example.LivPart2.destinations.DailyActivityOverviewAppDestination
import com.example.LivPart2.destinations.DashboardAppDestination
import com.example.LivPart2.destinations.ProfileAppDestination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

/*
    NavBar made following guide
    https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary#bottomappbar
 */
@Composable
fun BotNav(navigator: DestinationsNavigator) {
    Row(
        modifier = Modifier
        .fillMaxWidth()
        .border(BorderStroke(2.dp, Color.Black)),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceAround

    ) {
        BottomBarIconNav(navigator)


    }
}

@Composable
fun BottomBarIconNav(navigator: DestinationsNavigator) {
    IconButton(onClick = {
        navigator.navigate(
            DailyActivityOverviewAppDestination
        )
    }) {
        Icon(Icons.Filled.CalendarToday, contentDescription = "Daily")
    }

    IconButton(onClick = {
        navigator.navigate(
            DashboardAppDestination
        )
    }) {
        Icon(Icons.Filled.Dashboard, contentDescription = "Dashboard")
    }

    IconButton(onClick = {
        /*TODO*/
    }) {
        Icon(Icons.Filled.Add, contentDescription = "Add stuff")
    }

    IconButton(onClick = {
        navigator.navigate(
            ChatBotAppDestination
        )
    }) {
        Icon(Icons.Filled.Chat, contentDescription = "Chatbot")
    }

    IconButton(onClick = {
        navigator.navigate(
            ProfileAppDestination

        )
    }) {
        Icon(Icons.Filled.Person, contentDescription = "Profile")
    }
}

