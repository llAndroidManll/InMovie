package com.sahakyan.inmovie.presentation.ui.home

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.tooling.preview.Preview
import com.sahakyan.inmovie.domain.data.PopularData
import com.sahakyan.inmovie.domain.data.PopularMovie
import com.sahakyan.inmovie.presentation.state.CustomState
import com.sahakyan.inmovie.shared.util.Constants

@Composable
fun HomeScreen(
    state: State<CustomState<PopularData<PopularMovie>>>? = null,
) {

    state?.value?.let { customState ->
        when {
            customState.isLoading -> {
                Log.d(Constants.LOG_TAG, "HomeScreen: Loading...")
                Text(text = "Loading...")
            }
            customState.error != null -> {
                Log.d(Constants.LOG_TAG, "HomeScreen: Error -> ${customState.error}")
                Text(text = customState.error ?: "Unknown error")
            }
            customState.data != null -> {
                Log.d(Constants.LOG_TAG, "HomeScreen: Data Loaded -> ${customState.data}")
                // Display first movie's title as an example
                Text(text = customState.data.results[0].title)
            }
            else -> {
                Log.d(Constants.LOG_TAG, "HomeScreen: No Data Available")
                Text(text = "No data available")
            }
        }
    } ?: run {
        Log.e(Constants.LOG_TAG, "HomeScreen: State is null")
        Text(text = "State is null")
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    HomeScreen()
}