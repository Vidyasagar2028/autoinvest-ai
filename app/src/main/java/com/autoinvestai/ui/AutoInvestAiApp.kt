package com.autoinvestai.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.autoinvestai.navigation.AppScreen
import com.autoinvestai.ui.screens.DashboardScreen
import com.autoinvestai.ui.screens.LoginScreen

@Composable
fun AutoInvestAiApp() {
    val navController = rememberNavController()

    Surface(modifier = Modifier.fillMaxSize()) {
        NavHost(
            navController = navController,
            startDestination = AppScreen.Login.route
        ) {
            composable(AppScreen.Login.route) {
                LoginScreen(
                    onLoginSuccess = {
                        navController.navigate(AppScreen.Dashboard.route) {
                            popUpTo(AppScreen.Login.route) { inclusive = true }
                            launchSingleTop = true
                        }
                    }
                )
            }
            composable(AppScreen.Dashboard.route) {
                DashboardScreen()
            }
        }
    }
}
