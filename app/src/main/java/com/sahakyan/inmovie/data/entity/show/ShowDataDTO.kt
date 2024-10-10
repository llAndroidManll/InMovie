package com.sahakyan.inmovie.data.entity.show

import com.google.gson.annotations.SerializedName
import com.sahakyan.inmovie.data.entity.shared.GenreDTO
import com.sahakyan.inmovie.data.entity.shared.SpokenLanguageDTO

data class ShowDataDTO(

    @SerializedName("adult")
    val adult: Boolean = false,

    @SerializedName("backdrop_path")
    val backdropPath: String? = null,

    @SerializedName("created_by")
    val createdBy: List<Any> = listOf(), // Replace Any with the appropriate DTO if needed

    @SerializedName("episode_run_time")
    val episodeRunTime: List<Int> = listOf(),

    @SerializedName("first_air_date")
    val firstAirDate: String? = null,

    @SerializedName("genres")
    val genres: List<GenreDTO> = listOf(),

    @SerializedName("homepage")
    val homepage: String? = null,

    @SerializedName("id")
    val id: Int = 0,

    @SerializedName("in_production")
    val inProduction: Boolean = false,

    @SerializedName("languages")
    val languages: List<String> = listOf(),

    @SerializedName("last_air_date")
    val lastAirDate: String? = null,

    @SerializedName("last_episode_to_air")
    val lastEpisodeToAir: LastEpisodeDTO? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("next_episode_to_air")
    val nextEpisodeToAir: Any? = null, // Replace Any with the appropriate DTO if needed

    @SerializedName("networks")
    val networks: List<NetworkDTO> = listOf(),

    @SerializedName("number_of_episodes")
    val numberOfEpisodes: Int = 0,

    @SerializedName("number_of_seasons")
    val numberOfSeasons: Int = 0,

    @SerializedName("origin_country")
    val originCountry: List<String> = listOf(),

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

    @SerializedName("production_companies")
    val productionCompanies: List<Any> = listOf(), // Replace Any with the appropriate DTO if needed

    @SerializedName("production_countries")
    val productionCountries: List<Any> = listOf(), // Replace Any with the appropriate DTO if needed

    @SerializedName("seasons")
    val seasons: List<SeasonDTO> = listOf(),

    @SerializedName("spoken_languages")
    val spokenLanguages: List<SpokenLanguageDTO> = listOf(),

    @SerializedName("status")
    val status: String? = null,

    @SerializedName("tagline")
    val tagline: String? = null,

    @SerializedName("type")
    val type: String? = null,

    @SerializedName("vote_average")
    val voteAverage: Double = 0.0,

    @SerializedName("vote_count")
    val voteCount: Int = 0
)

data class LastEpisodeDTO(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("overview")
    val overview: String?,
    @SerializedName("vote_average")
    val voteAverage: Double,
    @SerializedName("vote_count")
    val voteCount: Int,
    @SerializedName("air_date")
    val airDate: String,
    @SerializedName("episode_number")
    val episodeNumber: Int,
    @SerializedName("episode_type")
    val episodeType: String,
    @SerializedName("production_code")
    val productionCode: String?,
    @SerializedName("runtime")
    val runtime: Int?,
    @SerializedName("season_number")
    val seasonNumber: Int,
    @SerializedName("show_id")
    val showId: Int,
    @SerializedName("still_path")
    val stillPath: String?
)

data class NetworkDTO(
    @SerializedName("id")
    val id: Int,

    @SerializedName("logo_path")
    val logoPath: String?,

    @SerializedName("name")
    val name: String,

    @SerializedName("origin_country")
    val originCountry: String
)

data class SeasonDTO(
    @SerializedName("air_date")
    val airDate: String?,

    @SerializedName("episode_count")
    val episodeCount: Int,

    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String,

    @SerializedName("overview")
    val overview: String?,

    @SerializedName("poster_path")
    val posterPath: String?,

    @SerializedName("season_number")
    val seasonNumber: Int,

    @SerializedName("vote_average")
    val voteAverage: Double
)