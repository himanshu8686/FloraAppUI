package com.floraappui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.floraappui.ScreenRoutes
import com.floraappui.presentation.splash.SplashScreen

@Composable
fun Navigation() {
    val navController: NavHostController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.SplashScreen.route
    )
    {
        composable(ScreenRoutes.SplashScreen.route){
            SplashScreen(navController = navController)
        }
        composable(ScreenRoutes.LoginScreen.route){
            SplashScreen(navController = navController)
        }
    }
}