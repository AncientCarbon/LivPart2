package com.example.livpart2

import android.annotation.SuppressLint
import androidx.compose.runtime.mutableStateOf
import android.media.metrics.Event
import androidx.annotation.Dimension
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
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
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.PaintingStyle.Companion.Fill

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