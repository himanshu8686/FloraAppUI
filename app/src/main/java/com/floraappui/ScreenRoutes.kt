package com.floraappui

sealed class ScreenRoutes(val route : String){

    object SplashScreen : ScreenRoutes("splash_screen")
    object LoginScreen : ScreenRoutes("login_screen")
    object HomeScreen : ScreenRoutes("home_screen")
}
