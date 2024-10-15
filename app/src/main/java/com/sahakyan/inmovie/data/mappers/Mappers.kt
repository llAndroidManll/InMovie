package com.sahakyan.inmovie.data.mappers

import com.sahakyan.inmovie.data.entity.shared.PopularDTO
import com.sahakyan.inmovie.data.entity.shared.PopularDataDTO
import com.sahakyan.inmovie.domain.data.PopularData
import com.sahakyan.inmovie.domain.data.PopularMovie
import com.sahakyan.inmovie.shared.util.Constants

// * Mapper functions (Convertor) from DTO files (from data layer) to to Data (in domain layer)

fun PopularDTO<PopularDataDTO>.toPopularData(): PopularData<PopularMovie> {
    val page = this.page
    val results = this.results.map { it.toPopularData() }
    val totalPages = this.totalPages
    val totalResults = this.totalResults
    return PopularData(
        page = page,
        results = results,
        totalPages = totalPages,
        totalResults = totalResults
    )
}

fun PopularDataDTO.toPopularData(): PopularMovie {
    val adult = this.adult
    val genreIds = this.genreIds
    val id = this.id
    val originalTitle = this.originalTitle
    val originalLanguage = this.originalLanguage
    val popularity = this.popularity
    val posterPath = Constants.IMAGE_BASE_URL.plus(this.posterPath)
    val releaseDate = this.releaseDate
    val title = this.title
    val voteAverage = this.voteAverage
    return PopularMovie(
        adult = adult,
        genreIds = genreIds,
        id = id,
        originalTitle = originalTitle,
        originalLanguage = originalLanguage,
        popularity = popularity,
        posterPath = posterPath,
        releaseDate = releaseDate,
        title = title,
        voteAverage = voteAverage
    )
}