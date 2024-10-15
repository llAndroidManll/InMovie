package com.sahakyan.inmovie.presentation.ui.home

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
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
                HomeScreenMain(customState.data)
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
fun HomeScreenMain(
    data: PopularData<PopularMovie>
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        AsyncImage(
            model = data.results[3].posterPath,
            contentDescription = data.results[0].title,
            modifier = Modifier.size(30.dp),
        )

        Text(data.results[3].posterPath)
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    HomeScreen()
}