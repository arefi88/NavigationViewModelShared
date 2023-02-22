package com.example.maktabnavigationproje

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var textButton=MutableLiveData<String>()

    fun updateText(btnText:String){
        textButton.value=btnText
    }
}