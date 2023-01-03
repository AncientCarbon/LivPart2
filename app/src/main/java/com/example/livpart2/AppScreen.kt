package com.example.livpart2

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.livpart2.ui.theme.viewModel

enum class Screen(val route: String) {
    StartScreen("startScreen"),
    LoginScreen("loginScreen")
}


@Composable
fun AppScreen(
    modifier: Modifier = Modifier,
    viewModel: viewModel = viewModel()
    //---------------------------------
    //nav not working :(
    //navController: NavHostController = rememberNavController()
    //---------------------------------
    ) {
    //body
}