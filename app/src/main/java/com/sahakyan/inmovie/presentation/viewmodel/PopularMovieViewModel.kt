package com.sahakyan.inmovie.presentation.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sahakyan.inmovie.domain.data.PopularData
import com.sahakyan.inmovie.domain.data.PopularMovie
import com.sahakyan.inmovie.domain.repository.MovieRepository
import com.sahakyan.inmovie.domain.utils.Resource
import com.sahakyan.inmovie.presentation.state.CustomState
import com.sahakyan.inmovie.shared.util.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PopularMovieViewModel @Inject constructor(
    private val repository: MovieRepository
) : ViewModel(){

    /*var state by mutableStateOf(CustomState<PopularData<PopularMovie>>())
        private set*/

    private val _state = MutableStateFlow(CustomState<PopularData<PopularMovie>>())
    val state = _state.asStateFlow()

    init {
        Log.d(Constants.LOG_TAG, "init")
        loadPopularMovies()
    }
    private fun loadPopularMovies(
        language: String = "en-US",
        page: Int = 1
    ) {
        viewModelScope.launch {
            _state.value = _state.value.copy(
                isLoading = true,
                error = null
            )
            when(
                val result = repository.getPopularMovies(language = language,page = page)
            ) {
                is Resource.Success -> {
                    Log.d(Constants.LOG_TAG, "loadPopularMovies: ${result.data}")
                    _state.value = _state.value.copy(
                        isLoading = false,
                        data = result.data,
                        error = null
                    )
                }
                is Resource.Error -> {
                    Log.d(Constants.LOG_TAG, "loadPopularMovies: ${result.message}")
                    _state.value = _state.value.copy(
                        isLoading = false,
                        data = null,
                        error = result.message
                    )
                }
            }

        }
    }

}