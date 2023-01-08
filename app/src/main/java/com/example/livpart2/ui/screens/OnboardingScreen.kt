package com.example.livpart2

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.livpart2.ui.theme.LivPart2Theme

@Composable
fun OnboardingApp(modifier: Modifier = Modifier) {

    var shouldShowOnboarding by remember { mutableStateOf(true) }

    Surface(modifier) {
        if (shouldShowOnboarding) {
            OnboardingScreen(onContinueClicked = { shouldShowOnboarding = false })
        } else {
            Greetings()
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
    modifier: Modifier = Modifier,
    onboarding: List<String> = listOf("Integrate Health App", "Connect Bluetooth", "Sync Calender", "Give Access to Location", "Enable Notifications")
) {
    Column(modifier = modifier.padding(vertical = 4.dp)) {
        for (question in onboarding) {
            Greeting(question = question)
        }
    }
}


@Composable
private fun Greeting(question: String) {

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





@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun OnboardingPreview() {
    LivPart2Theme {
        OnboardingScreen(onContinueClicked = {})
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    LivPart2Theme {
        Greetings()
    }
}

@Preview
@Composable
fun MyAppPreview() {
    LivPart2Theme {
        OnboardingApp(Modifier.fillMaxSize())
    }
}