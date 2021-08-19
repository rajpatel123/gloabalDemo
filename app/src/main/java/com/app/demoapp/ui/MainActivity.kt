package com.app.demoapp.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.app.demoapp.R
import com.app.demoapp.databinding.ActivityMainBinding
import com.app.demoapp.interfaces.InputValidateListener
import com.app.demoapp.viewmodel.PalindromeViewModel

class MainActivity : AppCompatActivity(), InputValidateListener {
    lateinit var binding: ActivityMainBinding
    lateinit var palindromeViewModel: PalindromeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        palindromeViewModel = ViewModelProviders.of(this).get(PalindromeViewModel::class.java)
        palindromeViewModel.inputValidateListener=this
        binding.palindromeViewModel = palindromeViewModel

    }

    override fun onStarted() {
        Toast.makeText(this, "Validating..", Toast.LENGTH_SHORT).show()

    }

    override fun onSuccess(isPalindrome: LiveData<String>) {
        isPalindrome.observe(this, Observer {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        })
    }

    override fun onError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    }
}