package com.mexiti.catphotoapp.network

import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.mexiti.catphotoapp.model.DogModel
import retrofit2.Retrofit
import retrofit2.http.GET

private const val BASE_URL="https://api-ninjas.com/api/dogs"

private val retrofit =Retrofit.Builder()
    .addConverterFactory(Json.asConverterFactory("aplication/json".toMediaType()))
    .baseUrl(BASE_URL)
    .build()

interface DogApiService{
    @GET("https://api.api-ninjas.com/v1/dogs?name=")
    suspend fun getPhotos():List<DogModel>
}

//Patron de diseño Singleton

object DogApi{
    val retrofitService:DogApiService by lazy{
        retrofit.create(DogApiService::class.java)
    }
}