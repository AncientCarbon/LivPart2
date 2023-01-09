package com.example.livpart2.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun ProfileApp(navigator : DestinationsNavigator, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .background(MaterialTheme.colors.background),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LogOutButton()
            ProfileHeader()

        }

        Column(modifier = Modifier
            .padding(top=150.dp),
        ) {
            Row (horizontalArrangement = Arrangement.spacedBy(20.dp)
            ){
                HealthStats()
                HealthStats2()
            }
        }
        Column(modifier = Modifier
            .padding(top=300.dp),
        ) {
            Row (horizontalArrangement = Arrangement.spacedBy(20.dp)
            ){
                ProfileGender()
                ProfileHeight()
                ProfileAge()

            }
        }
        Column(modifier = Modifier
            .padding(top=400.dp),){
            Goals()
        }

        BotNav(navigator)
    }
}

@Composable
fun Goals(){
    Button(onClick = { /*TODO*/ }, modifier = Modifier
        .padding()
        .fillMaxWidth()
        .height(100.dp)) {
        Text(text = "GOALS SUI")
    }
}

@Composable
fun ProfileAge(){
    Text(text = "21")
}
@Composable
fun ProfileGender(){
    Text(text = "Male")
}
@Composable
fun ProfileHeight(){
    Text(text = "192 cm")
}
@Composable
fun HealthStats(){
    Text(text = "Whatever the hell this is")
}
@Composable
fun HealthStats2(){
    Text(text = "Whatever the hell this is2")
}

@Composable
fun LogOutButton(){
    Button(
        onClick = { },
        shape = RoundedCornerShape(50.dp),
        modifier = Modifier
            .padding(top = 24.dp)
            .width(150.dp)
            .height(50.dp)
    ) {
        Text(text = "Log out")
    }
}
@Composable
fun ProfileHeader() {
    Text(text = "Magnus Bruus", fontSize = 36.sp)
}

