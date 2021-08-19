package com.app.demoapp

import android.content.Context
import android.widget.Toast

class ViewUtils {
    fun Context.toast(message:String){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }
}