package com.sahakyan.inmovie.domain.repository

import com.sahakyan.inmovie.domain.data.PopularData
import com.sahakyan.inmovie.domain.data.PopularMovie
import com.sahakyan.inmovie.domain.utils.Resource

interface MovieRepository {

    suspend fun getPopularMovies(
        language: String = "en-US",
        page: Int = 1
    ): Resource<PopularData<PopularMovie>>

}