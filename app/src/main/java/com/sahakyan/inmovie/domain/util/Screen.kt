package com.sahakyan.inmovie.domain.util

sealed class Screen(
    val route: String,
) {

    data object HomeScreen : Screen ("home_screen")

}