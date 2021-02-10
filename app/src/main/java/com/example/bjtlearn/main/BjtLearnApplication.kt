package com.example.bjtlearn.main

import android.app.Application
import android.content.Context
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.imagepipeline.core.ImagePipelineConfig

class BjtLearnApplication : Application() {
    
    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        initFresco()
    }

    private fun initFresco() {
        val config = ImagePipelineConfig
                        .newBuilder(context)
                        .setDownsampleEnabled(true)
                        .build()
        Fresco.initialize(context, config)
    }
    
}