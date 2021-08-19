package com.app.demoapp.repository

import android.R.string
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


class PalindromeInputRepository {
    private var flag: Boolean=false

    fun isPalindrome(input: String) : LiveData<String>{
        val isPalindrome = MutableLiveData<String>()
        val sb = StringBuilder(input)

        //reverse the string
        val reverseStr = sb.reverse().toString()

        //compare reversed string with input string
        val flag = input.equals(reverseStr, ignoreCase = true)
        if (flag){
            isPalindrome.value = input+" is a Palindrome "
        }else{
            isPalindrome.value = input+" is not a Palindrome "
        }


        return isPalindrome
    }
}