package com.example.bjtlearn.db.base

import android.content.ContentValues
import android.util.Log
import com.example.bjtlearn.main.BjtLearnApplication
import java.lang.RuntimeException

object DBManager {

    private const val TAG = "DBManager"
    private const val VERSION = 1
    private const val DBNAME = "bjt_learn_db"
    private val mOpenHelper by lazy { DBHelper(BjtLearnApplication.context, DBNAME, VERSION) }
    private val mDatabase by lazy { mOpenHelper.writableDatabase }

    fun insert(tableName: String?, nullColumnHack: String?, value: ContentValues): Long {
        if (tableName.isNullOrEmpty()) {
            Log.d(TAG, "insert invalid params: $tableName")
        }
        try {
            Log.d(TAG, "db path: ${mDatabase.path}")
            return mDatabase.insert(tableName, nullColumnHack, value)
        } catch (t: Throwable) {
            Log.e(TAG, "db insert throwable: ${t.message}")
            t.printStackTrace()
        }
        return -1
    }

    fun delete(tableName: String?, whereClause: String?, whereArgs: Array<String>?): Int {
        if (tableName.isNullOrEmpty()) {
            Log.d(TAG, "delete invalid params: $tableName")
        }
        try {
            return mDatabase.delete(tableName, whereClause, whereArgs)
        } catch (t: Throwable) {
            Log.e(TAG, "db insert throwable: ${t.message}")
            t.printStackTrace()
        }
        return 0
    }

    fun beginTransaction() {
        if (mDatabase.inTransaction()) {
            Log.e(TAG, "beginTransaction, already in transaction, currentTid = ${Thread.currentThread()}", RuntimeException())
        } else {
            try {
                mDatabase.beginTransaction()
            } catch (t: Throwable) {
                Log.e(TAG, "beginTransaction exception: ${t.message}")
                t.printStackTrace()
            }
        }
    }

    fun endTransaction() {
        if (mDatabase.inTransaction()) {
            try {
                mDatabase.setTransactionSuccessful()
                mDatabase.endTransaction()
            } catch (t: Throwable) {

            }
        } else {
            Log.e(TAG, "endTransaction, database is not in transaction")
        }
    }

}