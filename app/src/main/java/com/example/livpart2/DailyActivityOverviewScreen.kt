package com.example.livpart2

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer

//seems like the scrollable parameter needs to be added to the
    // parameters of the function, and NOT the surface or column


@Composable
fun DailyActivityOverviewApp() {
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
    }
}
