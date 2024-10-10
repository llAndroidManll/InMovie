package com.sahakyan.inmovie.presentation.state

data class CustomState<T>(
    val data: T? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)