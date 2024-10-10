package com.sahakyan.inmovie.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sahakyan.inmovie.domain.data.PopularData
import com.sahakyan.inmovie.domain.data.PopularMovie
import com.sahakyan.inmovie.presentation.state.CustomState
import com.sahakyan.inmovie.presentation.ui.home.HomeScreen
import com.sahakyan.inmovie.presentation.viewmodel.PopularMovieViewModel
import com.sahakyan.inmovie.shared.util.Constants
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


@Composable
fun AppNavHost(
    navController: NavHostController
) {
    val lifecycleScope = LocalLifecycleOwner.current.lifecycleScope
    val popularMovieViewModel: PopularMovieViewModel = hiltViewModel()


    NavHost(navController = navController, startDestination = NavigationScreens.HomeScreen.route) {
        composable(NavigationScreens.HomeScreen.route) {

            HomeScreen(
                state = popularMovieViewModel.state.collectAsState(),
            )
        }
    }
}