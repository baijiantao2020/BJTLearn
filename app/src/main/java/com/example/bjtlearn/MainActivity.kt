package com.example.bjtlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.bjtlearn.maintab.FeedTabFragment
import com.example.bjtlearn.maintab.MsgTabFragment
import com.example.bjtlearn.maintab.NearByTabFragment
import com.example.bjtlearn.maintab.ProfileTabFragment
import com.example.bjtlearn.test.TestDao
import com.example.bjtlearn.test.TestDataStruct
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_view_pager.adapter = MainViewPagerAdapter(this.supportFragmentManager)
    }

    inner class MainViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> FeedTabFragment()
                1 -> NearByTabFragment()
                2 -> MsgTabFragment()
                else -> ProfileTabFragment()
            }
        }

        override fun getCount(): Int {
            return 4
        }
    }
}