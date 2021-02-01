package com.example.bjtlearn.utils

import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.common.ResizeOptions
import com.facebook.imagepipeline.request.ImageRequestBuilder

object FrescoHelper {

    @JvmStatic
    fun bindResourceId(view: SimpleDraweeView?, resId: Int) {
        if (view == null) {
            return
        }
        val request = ImageRequestBuilder
                        .newBuilderWithResourceId(resId)
                        .build()
        view.setImageURI(request.sourceUri)
    }

}