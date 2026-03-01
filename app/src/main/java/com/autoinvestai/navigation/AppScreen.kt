package com.autoinvestai.navigation

sealed class AppScreen(val route: String) {
    data object Login : AppScreen("login")
    data object Dashboard : AppScreen("dashboard")
}
