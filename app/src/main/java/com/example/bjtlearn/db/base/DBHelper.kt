package com.example.bjtlearn.db.base

import android.content.Context
import com.example.bjtlearn.test.TestDao
import com.tencent.wcdb.database.SQLiteDatabase
import com.tencent.wcdb.database.SQLiteOpenHelper


class DBHelper(context: Context, name: String, version: Int) : SQLiteOpenHelper(context, name, null, version){

//    private val mContext by lazy { context }
//    private val mDBName by lazy { name }
//    private val mDBVersion by lazy { version }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(TestDao.getCreator())
        db?.execSQL(TestDao.getIndexCreator())
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}