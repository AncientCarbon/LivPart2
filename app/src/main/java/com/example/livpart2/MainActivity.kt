package com.example.livpart2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.livpart2.ui.theme.LivPart2Theme
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LivPart2Theme {
                DestinationsNavHost(navGraph = NavGraphs.root)
            }
        }
    }
}

@Destination (start = true)
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

@Preview
@Composable
fun OnboardingPreview(){
    DestinationsNavHost(navGraph = NavGraphs.root)
}
