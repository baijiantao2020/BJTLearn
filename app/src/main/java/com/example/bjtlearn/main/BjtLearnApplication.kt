package com.example.bjtlearn.main

import android.app.Application
import android.content.Context

class BjtLearnApplication : Application() {
    
    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
    
}