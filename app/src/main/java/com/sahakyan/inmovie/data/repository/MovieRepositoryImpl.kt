package com.sahakyan.inmovie.data.repository

import com.sahakyan.inmovie.data.mappers.toPopularData
import com.sahakyan.inmovie.data.remote.MovieApi
import com.sahakyan.inmovie.domain.data.PopularData
import com.sahakyan.inmovie.domain.data.PopularMovie
import com.sahakyan.inmovie.domain.repository.MovieRepository
import com.sahakyan.inmovie.domain.utils.Resource
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val api: MovieApi
): MovieRepository {
    override suspend fun getPopularMovies(
        language: String,
        page: Int
    ): Resource<PopularData<PopularMovie>> {
        return try {
            Resource.Success(
                data = api.getPopularMovies(
                    language = language,
                    page = page,
                ).toPopularData()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}