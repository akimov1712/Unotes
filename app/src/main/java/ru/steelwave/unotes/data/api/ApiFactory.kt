package ru.steelwave.unotes.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiFactory {

    private const val BASE_URL = ""
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}