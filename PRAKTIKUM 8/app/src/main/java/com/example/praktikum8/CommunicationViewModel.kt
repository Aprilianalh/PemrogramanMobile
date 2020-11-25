package com.example.praktikum8

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel(){
    private val mName = MutableLiveData<String>()
    // deklarasi variabel
    val name : LiveData<String>
        get() = mName

    // informasi mengenai method
    fun setName(name:String){
        mName.value = name
    }
}
