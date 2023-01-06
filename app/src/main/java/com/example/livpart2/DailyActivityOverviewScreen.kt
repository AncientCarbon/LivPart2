package com.example.livpart2

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DailyActivityOverviewApp(){
    Surface(modifier = Modifier
        .fillMaxSize()
        .scrollable(state = rememberScrollState(), orientation = Orientation.Vertical)) {
        Column (modifier = Modifier.fillMaxSize().scrollable(state = rememberScrollState(), orientation = Orientation.Vertical)){
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
