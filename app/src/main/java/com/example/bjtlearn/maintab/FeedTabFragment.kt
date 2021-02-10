package com.example.bjtlearn.maintab

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bjtlearn.MainActivity
import com.example.bjtlearn.R
import com.example.bjtlearn.main.BjtLearnApplication
import com.example.bjtlearn.utils.FrescoHelper
import kotlinx.android.synthetic.main.feed_tab_fragment.*

class FeedTabFragment : Fragment() {

    companion object {
        private const val TAG = "FeedTabFragment"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.feed_tab_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initListener()
    }

    private fun initView() {

    }

    private fun initListener() {

    }
}