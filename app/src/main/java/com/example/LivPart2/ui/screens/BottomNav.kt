package com.example.LivPart2.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.LivPart2.destinations.*
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
            .padding(0.dp, 10.dp),
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
        Icon(Icons.Filled.Menu, contentDescription = "Daily")
    }

    IconButton(onClick = {
        navigator.navigate(
            DashboardAppDestination
        )
    }) {
        Icon(Icons.Filled.Menu, contentDescription = "Dashboard")
    }

    IconButton(onClick = {
        /*TODO*/
    }) {
        Icon(Icons.Filled.Menu, contentDescription = "Add stuff")
    }

    IconButton(onClick = {
        navigator.navigate(
            ChatBotAppDestination
        )
    }) {
        Icon(Icons.Filled.Menu, contentDescription = "Chatbot")
    }

    IconButton(onClick = {
        navigator.navigate(
            ProfileAppDestination
        )
    }) {
        Icon(Icons.Filled.Menu, contentDescription = "Profile")
    }
}

