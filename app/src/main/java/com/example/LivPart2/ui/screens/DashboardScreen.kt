package com.example.LivPart2.ui.screens


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
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
            TopNav(navigator)
            Column(modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Column(
                    modifier = Modifier
                        .padding()
                        .background(MaterialTheme.colors.background),
                    verticalArrangement = Arrangement.Top,
                ) {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        DateNow()
                        PlusButton()

                    }
                }
                Column(
                    modifier = Modifier
                        .padding(top = 250.dp)
                        .background(MaterialTheme.colors.background),
                    verticalArrangement = Arrangement.Top,
                ) {

                }
                SearchBar()
                Column(
                    modifier = Modifier
                        .padding(top = 400.dp)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.Top,
                ) {

                    Text(text = "Trends")
                    Trend1()
                    Trend2()
                    Trend2()
                    Trend2()
                    Trend2()

                }
                BotNav(navigator)
            }
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

/*
Circular button implementation based on the following link:
https://www.geeksforgeeks.org/create-a-circular-button-with-an-icon-in-android-jetpack-compose/
 */
@Composable
fun PlusButton() {
    Button(onClick = { /*TODO*/ }, modifier = Modifier.size(50.dp),
        shape = CircleShape,
        border = BorderStroke(5.dp, Color(0XFF0F9D58))

    ) {
        Text(text = "+", fontSize = 35.sp)
    }
}

@Composable
fun SearchBar(){
    var text by remember { mutableStateOf("") }

    TextField(modifier = Modifier
        .padding(top = 350.dp)
        .height(50.dp),
        value = text,
        onValueChange = { text = it },
        label = { Text("Search") }
    )
}

@Composable
fun Trend1(){
    Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
        Text(text = "Usain bolt beats Michael phelps in a swimming contest!", fontSize = 25.sp)
    }
}
@Composable
fun Trend2(){
    Button(onClick = { /*TODO*/ },
        Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)) {
        Text(text = "Flinke Flemming is flink for more than 2 years in a row without bein not flink", fontSize = 25.sp)
    }
}
