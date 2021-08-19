package com.app.demoapp.viewmodel

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.demoapp.interfaces.InputValidateListener
import com.app.demoapp.repository.PalindromeInputRepository

class PalindromeViewModel : ViewModel(){
  var userInput :String?=""
    val isPalindrome = MutableLiveData<String>()

    val isPalindromeoutPut : LiveData<String> get()= isPalindrome

    var inputValidateListener: InputValidateListener? = null


    fun onCheckPalindrome(v: View){
        if (userInput.isNullOrEmpty()){
            inputValidateListener?.onError("Please enter input")
            return
        }

        inputValidateListener?.onStarted()

       val  isPalindrome =  PalindromeInputRepository().isPalindrome(userInput!!)
        inputValidateListener?.onSuccess(isPalindrome)


    }
}