package com.app.demoapp.interfaces

import androidx.lifecycle.LiveData

interface InputValidateListener {
    fun onStarted()
    fun onSuccess(message: LiveData<String>)
    fun onError(message:String)
}