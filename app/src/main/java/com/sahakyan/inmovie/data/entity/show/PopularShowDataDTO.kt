package com.sahakyan.inmovie.data.entity.show

import com.google.gson.annotations.SerializedName

data class PopularShowDataDTO(

    @SerializedName("adult")
    val adult: Boolean = false,

    @SerializedName("backdrop_path")
    val backdropPath: String? = null,

    @SerializedName("genre_ids")
    val genreIds: List<Int>? = listOf(),

    @SerializedName("id")
    val id: Int = 0,

    @SerializedName("origin_country")
    val originCountry: List<String>? = listOf(),

    @SerializedName("original_language")
    val originalLanguage: String? = null,

    @SerializedName("original_name")
    val originalName: String? = null,

    @SerializedName("overview")
    val overview: String? = null,

    @SerializedName("popularity")
    val popularity: Double = 0.0,

    @SerializedName("poster_path")
    val posterPath: String? = null,

    @SerializedName("first_air_date")
    val firstAirDate: String? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("vote_average")
    val voteAverage: Double = 0.0,

    @SerializedName("vote_count")
    val voteCount: Int = 0
)
