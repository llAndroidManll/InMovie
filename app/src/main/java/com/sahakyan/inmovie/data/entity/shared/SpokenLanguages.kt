package com.sahakyan.inmovie.data.entity.shared

import com.google.gson.annotations.SerializedName

data class SpokenLanguageDTO(
    @SerializedName("english_name")
    val englishName: String,

    @SerializedName("iso_639_1")
    val iso: String,

    @SerializedName("name")
    val name: String
)