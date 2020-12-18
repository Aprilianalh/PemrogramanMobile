package com.example.praktikum11.api

import com.example.praktikum11.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

//untuk memasukkan semua gambar ke dalam daftar
interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>
}
