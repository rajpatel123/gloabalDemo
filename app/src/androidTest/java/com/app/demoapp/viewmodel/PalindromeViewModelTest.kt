package com.app.demoapp.viewmodel

import android.content.Context
import android.view.View
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.app.demoapp.getOrAwaitValue
import junit.framework.TestCase
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PalindromeViewModelTest : TestCase() {

    private lateinit var palindromeViewModel: PalindromeViewModel
    private lateinit var context: Context

    @Before
    override fun setUp() {
        super.setUp()
        palindromeViewModel = PalindromeViewModel()
        context = ApplicationProvider.getApplicationContext<Context>()
    }


    @Test
    fun testMyViewModel() {
        palindromeViewModel.userInput = "121"
        val flag = palindromeViewModel.onCheckPalindrome(View(context))
     //   assert(flag==)
    }
}