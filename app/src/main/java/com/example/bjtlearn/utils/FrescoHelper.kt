package com.example.bjtlearn.utils

import android.graphics.drawable.Animatable
import android.net.Uri
import android.util.Log
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.controller.ControllerListener
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.common.ResizeOptions
import com.facebook.imagepipeline.image.ImageInfo
import com.facebook.imagepipeline.request.ImageRequestBuilder

object FrescoHelper {

    private const val TAG = "FeedTabFragment"

    @JvmStatic
    fun bindResourceId(view: SimpleDraweeView?, resId: Int) {
        if (view == null) {
            return
        }
        val request = ImageRequestBuilder
                        .newBuilderWithResourceId(resId)
                        .setResizeOptions(ResizeOptions(70, 70))
                        .build()
        val controller = Fresco.newDraweeControllerBuilder()
                        .setOldController(view.controller)
                        .setImageRequest(request)
                        .setControllerListener(getControllerListener())
                        .build()
        view.controller = controller
    }

    @JvmStatic
    fun bindImageWithUri(view: SimpleDraweeView?, uri: String?) {
        if (view == null || uri.isNullOrEmpty()) {
            return
        }
        val request = ImageRequestBuilder
                .newBuilderWithSource(Uri.parse(uri))
                .build()
        val controller = Fresco.newDraweeControllerBuilder()
                .setOldController(view.controller)
                .setImageRequest(request)
                .build()
        view.controller = controller
    }

    private fun getControllerListener(): ControllerListener<ImageInfo> {
        return object : ControllerListener<ImageInfo> {
            override fun onSubmit(id: String?, callerContext: Any?) {
                Log.i(TAG, "getControllerListener onSubmit, id: $id, callerContext: ${callerContext}")
            }

            override fun onFinalImageSet(id: String?, imageInfo: ImageInfo?, animatable: Animatable?) {
                Log.i(TAG, "getControllerListener onFinalImageSet, id: $id, imageInfo: $imageInfo, abominable: $animatable")
            }

            override fun onIntermediateImageSet(id: String?, imageInfo: ImageInfo?) {
                Log.i(TAG, "getControllerListener onIntermediateImageSet, id: $id, imageInfo: $imageInfo")
            }

            override fun onIntermediateImageFailed(id: String?, throwable: Throwable?) {
                Log.i(TAG, "getControllerListener onIntermediateImageFailed, id: $id, throwable: $throwable")
            }

            override fun onFailure(id: String?, throwable: Throwable?) {
                Log.i(TAG, "getControllerListener onFailure, id: $id, throwable: $throwable")
            }

            override fun onRelease(id: String?) {
                Log.i(TAG, "getControllerListener onRelease id: $id")
            }
        }
    }

}