package com.example.livpart2

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.livpart2.ui.theme.viewModel

enum class Screen(val route: String) {
    OnboardingScreen("onboardingScreen"),
    LoginScreen("loginScreen"),
    RegisterOrLoginScreen("registerOrLoginScreen"),
    RegisterScreen("registerScreen"),
    ChatBotScreen("chatBotScreen"),
    DashScreen("dashScreen"),
    DailyActivityOverviewScreen("dailyActivityOverviewScreen"),
    SettingsScreen("SettingsScreen"),
    ProfileScreen("profileScreen")
}


@Composable
fun AppScreen(
    modifier: Modifier = Modifier,
    viewModel: viewModel = viewModel(),
    navController: NavHostController = rememberNavController()
    ) {
    //body
    Scaffold {
        innerPadding ->
        val uiState by viewModel.uiState.collectAsState()

        NavHost(
            navController = navController,
            startDestination = Screen.OnboardingScreen.route,
            modifier = modifier.padding(innerPadding)
        ){
            composable(route = Screen.LoginScreen.route) {
                OnboardingScreen(onContinueClicked = { /*TODO*/ })
            }
        }
    }
}



