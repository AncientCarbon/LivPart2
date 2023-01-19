package com.example.LivPart2.ui.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.LivPart2.destinations.RegisterOrLoginAppDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator



@Destination

@Composable
fun ProfileApp(navigator: DestinationsNavigator, modifier: Modifier = Modifier) {
    Surface(
            modifier = modifier
                    .fillMaxSize()
    ) {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                ProfilePicture()
                ProfileHeader()
                EditProfile()
            }

            Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .padding(top = 50.dp)
                        .weight(1f)
                        .background(MaterialTheme.colorScheme.background),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Account()
                Spacer(modifier = Modifier.height(10.dp))

                Connected()
                Spacer(modifier = Modifier.height(10.dp))

                Settings()
                Spacer(modifier = Modifier.height(10.dp))

                Privacy()


            }
            BotNav(navigator)
        }

    }

}
/*
Alot of this code is not needed in the final prduct, although some methods should be called
in the edit profile screen
 */


@Composable
fun Birthday() {
    Text(text = "2001/02/09")
}

@Composable
fun ProfileGender() {
    Text(text = "Male")
}

@Composable
fun ProfileHeight() {
    Text(text = "192 cm")
}

@Composable
fun ProfileWeight() {
    Text(text = "93.5kg")
}

@Composable
fun Account() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Icon(Icons.Filled.Person, contentDescription = "Account", modifier = Modifier.size(40.dp))


        Button(onClick = { /*TODO*/ }, modifier = Modifier
                .padding()
                .width(300.dp)
                .height(50.dp)) {
            Text(text = "Account")
        }

    }
}

@Composable
fun Connected() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Icon(Icons.Filled.BluetoothConnected, contentDescription = "Connected Devices", modifier = Modifier.size(40.dp))

        Button(onClick = { /*TODO*/ }, modifier = Modifier
                .padding()
                .width(300.dp)
                .height(50.dp)) {
            Text(text = "Connected Devices & Apps")
        }

    }
}

@Composable
fun Settings() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Icon(Icons.Filled.Settings, contentDescription = "Settings", modifier = Modifier.size(40.dp))


        Button(onClick = { /*TODO*/ }, modifier = Modifier
                .padding()
                .width(300.dp)
                .height(50.dp)) {

            Text(text = "Settings")
        }

    }
}

@Composable
fun Privacy() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Icon(Icons.Filled.Shield, contentDescription = "Privacy", modifier = Modifier.size(40.dp))

        Button(onClick = { /*TODO*/ }, modifier = Modifier
                .padding()
                .width(300.dp)
                .height(50.dp),
        ) {
            Text(text = "Privacy & Security")
        }

    }
}

@Composable
fun EditProfile(){
    Button(onClick = {/*TODO*/}, modifier = Modifier
            .padding()
            .width(150.dp)
            .height(40.dp)) {
        Text(text = "Edit Profile")
    }
}

@Composable
fun ProfilePicture() {
    Icon(Icons.Filled.Person, contentDescription = "Profile Picture", modifier = Modifier.size(100.dp))
}


@Composable
fun LogOutButton(navigator: DestinationsNavigator) {
    Button(
            onClick = { navigator.navigate(RegisterOrLoginAppDestination) },
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier
                    .padding(top = 24.dp)
                    .width(150.dp)
                    .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            MaterialTheme.colorScheme.primary
        )
    ) {
        Text(text = "Log out")
    }
}

@Composable
fun ProfileHeader() {
    Text(text = "Jon Jones", fontSize = 36.sp)
}

