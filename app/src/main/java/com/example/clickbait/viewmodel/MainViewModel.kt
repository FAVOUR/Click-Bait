package com.example.clickbait.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Created by Olije Favour on 10/29/2019.
 *Copyright (c) 2019    All rights reserved.
 */



class MainViewModel:ViewModel() {


    private var sSnackBar = MutableLiveData<String>()

    val _sSnackbar :LiveData<String>
    get() = sSnackBar


    fun clickBait(){

        viewModelScope.launch {

            delay(1000)

//            sSnackBar.value = "You have just clicked somewhere on the screen"
            sSnackBar.postValue( "You have just clicked somewhere on the screen")

        }
    }


}