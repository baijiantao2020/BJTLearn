package com.example.bjtlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bjtlearn.test.TestDataStruct
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun initListener() {
        insert_test.setOnClickListener {
            TestDataStruct(1).apply {

            }
        }
        delete_test.setOnClickListener {

        }
    }
}