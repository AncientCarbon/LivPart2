package com.example.livpart2.ui.screens

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
import com.example.livpart2.OnboardingApp
import com.example.livpart2.ui.view.viewModel

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




