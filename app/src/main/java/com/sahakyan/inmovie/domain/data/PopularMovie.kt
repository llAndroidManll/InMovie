package com.sahakyan.inmovie.domain.data

data class PopularMovie(
    val adult: Boolean = false,

    val genreIds: List<Int> = emptyList(),

    val id: Int = 0,

    // * For Movies
    val originalTitle: String = "",

    val originalLanguage: String = "",

    val popularity: Double = 0.0,

    val posterPath: String = "",

    // * For Movies
    val releaseDate: String = "",

    // * For Movies
    val title: String = "",

    val voteAverage: Double = 0.0
)
