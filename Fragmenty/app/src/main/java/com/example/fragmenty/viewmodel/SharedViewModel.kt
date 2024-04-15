package com.example.fragmenty.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//ViewModel PRZECHOWYWAĆ I ZARZĄDZAĆ danymi zwiazanymi z interfacem użytkownika
class SharedViewModel: ViewModel() {

    // LiveData - informuje zarejesrowane komponenty, o tym że,
    // musza zaktualizować swój interface
    private val _msg = MutableLiveData<String>()
    public val selectedMessage: LiveData<String> = _msg

    fun setMessage(msg: String){
        _msg.value = msg
    }

//    fun getMessage(): LiveData<String>{
//        return selectedMessage
//    }
}