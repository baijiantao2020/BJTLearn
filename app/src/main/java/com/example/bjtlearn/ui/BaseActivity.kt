package com.example.bjtlearn.ui

import androidx.appcompat.app.AppCompatActivity
import com.gyf.immersionbar.ktx.immersionBar

open class BaseActivity : AppCompatActivity() {

    open fun setStatusBarColor() {
        immersionBar {
            transparentStatusBar()

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        immersionBar {
            onDestroy()
        }
    }

}