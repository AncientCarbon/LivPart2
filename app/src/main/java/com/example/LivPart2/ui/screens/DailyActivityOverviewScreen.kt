package com.example.LivPart2.ui.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@OptIn(ExperimentalMaterial3Api::class)
@Destination
@Composable
fun DailyActivityOverviewApp(navigator: DestinationsNavigator) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState()) ) {
            for (hour in 0 until 24) {
                Row {
                    Text("$hour:00")
                    TextField(
                        value = "",
                        onValueChange = { /* handle task entry */ },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                Divider()
            }
            Button(onClick = { /* handle save button click */ }) {
                Text("Save")
            }
        }
        BotNav(navigator)
    }
}
