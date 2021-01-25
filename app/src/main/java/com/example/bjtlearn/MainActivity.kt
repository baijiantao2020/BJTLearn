package com.example.bjtlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bjtlearn.test.TestDao
import com.example.bjtlearn.test.TestDataStruct
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListener()
    }

    private fun initListener() {
        insert_test.setOnClickListener {
            TestDataStruct(1).apply {
                TestDao.insert(TestDataStruct((Math.random() * 1000).toInt()))
            }
        }
        delete_test.setOnClickListener {

        }
        query_test.setOnClickListener {
            TestDao.testIndex()
        }
    }
}