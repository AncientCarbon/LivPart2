package com.example.LivPart2.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import java.text.SimpleDateFormat
import java.util.*


@Destination
@Composable
fun DashboardApp(navigator: DestinationsNavigator, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .fillMaxSize()
    ) {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top) {
            Column(modifier = Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState())
                .background(MaterialTheme.colorScheme.background),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Column(
                    modifier = Modifier
                        .padding()
                        .background(MaterialTheme.colorScheme.background),
                    verticalArrangement = Arrangement.Top,
                ) {
                    TimeRange()

                    Row(modifier = Modifier.fillMaxWidth()) {
                        DateNow()
                    }
                    Graph()
                }
                Column(
                    verticalArrangement = Arrangement.Top,
                ) {

                    Text(text = "Trends")
                    Trend1()
                    Trend2()
                    Trend3()

                }
            }
            BotNav(navigator)
        }
    }
}


/* Current date implementation based on the following link
https://www.geeksforgeeks.org/how-to-get-current-time-and-date-in-android-using-jetpack-compose/
 */
@Composable
fun DateNow(){
    val sdf = SimpleDateFormat("'Date\n'dd-MM-yyyy")
    val currentDate = sdf.format(Date())
    Text(text = currentDate, textAlign = TextAlign.Left)
}

@Composable
fun Graph(){
    Button(onClick = { /*TODO*/ }, modifier = Modifier
        .fillMaxWidth()
        .height(250.dp)) {
        Text(text = "Graph depicting summary of something over the timeperiod chosen in the top")
    }
}


@Composable
fun Trend1(){
    Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
        Text(text = "Usain bolt beats Michael phelps in a swimming contest!", fontSize = 15.sp)
    }
}
/*
Multioption button made following guide:
https://www.geeksforgeeks.org/radiobuttons-in-android-using-jetpack-compose/
*/
@Composable
fun TimeRange(){
    val timeOptions = listOf("Daily", "Weekly", "Monthly")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(timeOptions[2]) }
    Column {
        timeOptions.forEach { text ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .selectable(selected = (text == selectedOption),
                        onClick = { onOptionSelected(text) })
                    .padding(horizontal = 16.dp)
            ) {
                RadioButton(selected = (text ==selectedOption), modifier = Modifier.padding(all = Dp(value = 8F)),
                    onClick = { onOptionSelected(text)
                    })
                Text(text = text, modifier = Modifier.padding(start = 16.dp))
            }
        }
    }

}


@Composable
fun Trend2(){
    Button(onClick = { /*TODO*/ },
        Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)) {
        Text(text = "Conor Mcgregor knocks out Khabib in the fifth round!", fontSize = 15.sp)
    }
}


@Composable
fun Trend3(){
    Button(onClick = { /*TODO*/ },
        Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)) {
        Text(text = "Denmark wins world cup 2022 by a landslide! hear what Swedish football trainer had to say", fontSize = 15.sp)
    }
}