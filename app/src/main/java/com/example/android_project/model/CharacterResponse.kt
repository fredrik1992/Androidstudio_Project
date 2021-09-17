package com.example.android_project.model

import com.squareup.moshi.Json

data class CharacterResponse(
    @Json(name = "response")
    val response: String,
    @Json(name = "results-for")
    val resultsFor: String,
    @Json(name = "results")
    val results: List<Character>? = null
)