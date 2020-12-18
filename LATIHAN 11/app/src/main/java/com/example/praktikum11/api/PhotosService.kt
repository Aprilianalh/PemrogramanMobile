package com.example.praktikum11.api

import com.example.praktikum11.model.Photo
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class PhotosService {
    // Untuk membangun url, Untuk mengakses resource yang barada di direktori root web
    private val BASE_URL = "https://jsonplaceholder.typicode.com/"
    private val api: PhotosApi

    init {
        // retrofit builder
        // Untuk mengintegrasikan dua bagian dari aplikasi secara bersamaan
        api = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(PhotosApi::class.java)
    }
    fun getPhotos(): Single<List<Photo>> {
        return api.getPhotos()
    }
}
