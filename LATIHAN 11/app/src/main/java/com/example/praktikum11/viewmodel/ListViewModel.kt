package com.example.praktikum11.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.praktikum11.api.PhotosService
import com.example.praktikum11.model.Photo
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class ListViewModel : ViewModel() {
    //initiate the service
    private val photosService = PhotosService()
    private val disposable = CompositeDisposable()
    val photos = MutableLiveData<List<Photo>>()

    fun fetchData() {
        disposable.add(
            photosService.getPhotos()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<List<Photo>>(){
                    override fun onSuccess(value: List<Photo>?) {
                        photos.value = value
                    }
                    //error message
                    override fun onError(e: Throwable?) {
                        Log.e("ERROR FETCH DATA", "error$e")
                    }
                })
        )
    }

    // override untuk mengubah suatu fungsi pada parent
    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}