package com.example.LivPart2

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.LivPart2.destinations.RegisterOrLoginAppDestination

import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(start = true)
@Composable
fun OnboardingApp(
    navigator: DestinationsNavigator,
    modifier: Modifier = Modifier
    ) {

    var shouldShowOnboarding by remember { mutableStateOf(true) }

    Surface(modifier) {
        if (shouldShowOnboarding) {
            OnboardingScreen(onContinueClicked = { shouldShowOnboarding = false })
        } else {
            Greetings(navigator)
        }
    }
}


@Composable
fun OnboardingScreen(
    onContinueClicked: () -> Unit,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Welcome to Liv!")
        Button(
            modifier = Modifier.padding(vertical = 24.dp),
            onClick = onContinueClicked
        ) {
            Text("Continue")
        }
    }
}

@Composable
private fun Greetings(
    navigator: DestinationsNavigator,
    modifier: Modifier = Modifier,
    onboarding: List<String> = listOf(
        "Integrate Health App",
        "Connect Bluetooth",
        "Sync Calender",
        "Give Access to Location",
        "Enable Notifications")
) {
    Column(modifier = modifier.padding(vertical = 4.dp)) {
        for (question in onboarding) {
            GreetingBuilder(question = question)
        }
        Button(
            onClick = {
                navigator.navigate(
                    RegisterOrLoginAppDestination
                )
             }
        ) {
            Text("Login or Register")
        }
    }
}


@Composable
private fun GreetingBuilder(question: String) {
    val expanded = remember { mutableStateOf(false) }
    val extraPadding = if (expanded.value) 48.dp else 0.dp
    val checkState = remember{ mutableStateOf(false) }

    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier.padding(vertical = 20.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(20.dp)) {
            Column(modifier = Modifier
                .weight(1f)
                .padding(bottom = extraPadding)
            ) {
                Text(text = "Do you want to,")
                Text(text = question)
            }
            Switch(checked = checkState.value, onCheckedChange = {checkState.value = it})
        }
    }
}




/*
@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun OnboardingPreview() {
    LivPart2Theme {
        OnboardingScreen(onContinueClicked = {})
    }
}
 */

/*@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    LivPart2Theme {
       Greetings(navigator = DestinationsNavigator)
    }
}


@Preview
@Composable
fun MyAppPreview() {
    LivPart2Theme {
        val navController = rememberNavController()
        OnboardingApp(Modifier.fillMaxSize(), navController)
    }
}*/