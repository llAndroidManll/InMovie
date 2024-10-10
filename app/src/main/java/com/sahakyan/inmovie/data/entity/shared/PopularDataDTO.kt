package com.sahakyan.inmovie.data.entity.shared

import com.google.gson.annotations.SerializedName

data class PopularDataDTO(

    @SerializedName("adult")
    val adult: Boolean = false,

    @SerializedName("genre_ids")
    val genreIds: List<Int> = emptyList(),

    @SerializedName("id")
    val id: Int = 0,

    // * For Movies
    @SerializedName("original_title")
    val originalTitle: String = "",

    // * For TV Shows
    @SerializedName("original_name")
    val originalName: String = "",

    @SerializedName("original_language")
    val originalLanguage: String = "",

    @SerializedName("popularity")
    val popularity: Double = 0.0,

    @SerializedName("poster_path")
    val posterPath: String = "",

    // * For Movies
    @SerializedName("release_date")
    val releaseDate: String = "",

    // * For TV Shows
    @SerializedName("first_air_date")
    val firstAirDate: String = "",

    // * For Movies
    @SerializedName("title")
    val title: String = "",

    // * For TV Shows
    @SerializedName("name")
    val name: String = "",

    @SerializedName("vote_average")
    val voteAverage: Double = 0.0

)