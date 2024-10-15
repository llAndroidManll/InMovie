package com.sahakyan.inmovie.presentation.ui.home

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sahakyan.inmovie.domain.data.PopularData
import com.sahakyan.inmovie.domain.data.PopularMovie
import com.sahakyan.inmovie.presentation.state.CustomState
import com.sahakyan.inmovie.shared.compose.style.Coral
import com.sahakyan.inmovie.shared.compose.style.NaturalBlack
import com.sahakyan.inmovie.shared.compose.style.dimens
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
        modifier = Modifier.fillMaxSize().background(color = NaturalBlack),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        NavigationItems(

        )

        Text("Coming Soon", style = MaterialTheme.typography.titleMedium, color = Color.White)

        CardItem(
            data = data.results[0],
        )
    }
}

@Composable
fun NavigationItems(

) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.dimens.medium2),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "All Movies",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier,
                color = Coral
            )
            Text(
                text = "TV Series",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier,
                color = Color.White
            )
            Text(
                text = "Search",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier,
                color = Color.White
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    HomeScreen()
}