package com.sahakyan.inmovie.domain.data

data class PopularData<T>(
    val page: Int,
    val results: List<T>,
    val totalPages: Int,
    val totalResults: Int,
)