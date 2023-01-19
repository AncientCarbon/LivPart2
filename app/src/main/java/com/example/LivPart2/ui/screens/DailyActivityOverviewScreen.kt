package com.example.LivPart2.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top) {

            Column(modifier = Modifier.verticalScroll(rememberScrollState()).weight(1f).background(MaterialTheme.colorScheme.background),
            ) {
                for (hour in 0 until 24) {
                    Row {
                        Text("$hour:00")
                        TextField(
                            value = "",
                            onValueChange = { /* TODO */ },
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Divider()
                }
            }
            BotNav(navigator)
        }
    }
}
