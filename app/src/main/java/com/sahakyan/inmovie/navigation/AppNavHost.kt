package com.sahakyan.inmovie.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationScreens.HomeScreen.route) {
        composable(NavigationScreens.HomeScreen.route) {
        }
        composable("") {
        }
    }
}