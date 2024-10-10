package com.sahakyan.inmovie.data.remote

import com.sahakyan.inmovie.data.entity.shared.PopularDTO
import com.sahakyan.inmovie.data.entity.shared.PopularDataDTO
import com.sahakyan.inmovie.shared.util.Constants
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


/**
* Movie API
*/


interface MovieApi {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Header(Constants.ACCEPT) accept: String = Constants.ACCEPT_VALUE,
        @Header(Constants.AUTHORIZATION) authorization: String = Constants.API_READ_ACCESS_TOKEN,
        @Query("language") language: String = "en-US",
        @Query("page") page: Int = 1,
    ) : PopularDTO<PopularDataDTO>

}