package com.example.bjtlearn.test

import android.content.ContentValues
import android.util.Log
import com.example.bjtlearn.db.base.DBManager

object TestDao {

    private const val TAG = "TestDao"
    private const val TABLE_NAME = "TABLE_TEST"

    fun getCreator(): String {
        val sb = StringBuilder()
        sb.append("create table if not exists $TABLE_NAME (")
        TestColumn.values().forEach { column ->
            sb.append("${column.key} ${column.type},")
        }
        return sb.toString().apply {
            substring(0, this.length - 1)
        } + ");"
    }

    
    fun insert(data: TestDataStruct?): Long {
        if (data == null) {
            Log.d(TAG, "insert invalid params, data: $data")
        }
        try {
            return DBManager.insert(TABLE_NAME, null, buildValues(data!!))
        } catch (t: Throwable) {
            Log.e(TAG, "insert exception: ${t.message}")
            t.printStackTrace()
        }
        return -1
    }

    
    fun delete(tableName: String?, whereClause: String?, whereArgs: Array<String>?): Int {
        return DBManager.delete(tableName, whereClause, whereArgs)
    }

    private fun buildValues(data: TestDataStruct): ContentValues {
        return ContentValues(data.id)?.apply {
            put(TestColumn.COLUMN_AAA.key, "aaa${data.id}")
            put(TestColumn.COLUMN_BBB.key, "bbb${data.id}")
            put(TestColumn.COLUMN_CCC.key, "ccc${data.id}")
            put(TestColumn.COLUMN_DDD.key, data.id)
            put(TestColumn.COLUMN_EEE.key, "eee${data.id}")
            put(TestColumn.COLUMN_FFF.key, "fff${data.id}")
            put(TestColumn.COLUMN_GGG.key, "ggg${data.id}")
            put(TestColumn.COLUMN_HHH.key, data.id * 2)
            put(TestColumn.COLUMN_III.key, "iii${data.id}")
            put(TestColumn.COLUMN_JJJ.key, "jjj${data.id}")
            put(TestColumn.COLUMN_KKK.key, "kkk${data.id}")
            put(TestColumn.COLUMN_LLL.key, data.id * 3)
            put(TestColumn.COLUMN_MMM.key, "mmm${data.id}")
            put(TestColumn.COLUMN_NNN.key, "nnn${data.id}")
            put(TestColumn.COLUMN_OOO.key, "ooo${data.id}")
            put(TestColumn.COLUMN_PPP.key, "ppp${data.id}")
            put(TestColumn.COLUMN_QQQ.key, data.id * 4)
            put(TestColumn.COLUMN_RRR.key, "rrr${data.id}")
            put(TestColumn.COLUMN_SSS.key, "sss${data.id}")
            put(TestColumn.COLUMN_TTT.key, "ttt${data.id}")
            put(TestColumn.COLUMN_UUU.key, data.id * 5)
            put(TestColumn.COLUMN_VVV.key, "vvv${data.id}")
            put(TestColumn.COLUMN_WWW.key, "www${data.id}")
            put(TestColumn.COLUMN_XXX.key, "xxx${data.id}")
            put(TestColumn.COLUMN_YYY.key, "yyy${data.id}")
            put(TestColumn.COLUMN_XXX.key, data.id * 5)
        }
    }
}