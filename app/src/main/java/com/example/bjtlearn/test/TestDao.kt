package com.example.bjtlearn.test

import android.content.ContentValues
import android.util.Log
import com.example.bjtlearn.db.base.DBManager

object TestDao {

    private const val TAG = "TestDao"
    private const val TABLE_NAME = "TABLE_TEST"
    private const val TABLE_TEST_INDEX = "TABLE_TEST_INDEX"

    fun getCreator(): String {
        val sb = StringBuilder()
        sb.append("create table if not exists $TABLE_NAME (")
        TestColumn.values().forEach { column ->
            sb.append("${column.key} ${column.type},")
        }
        val sql = sb.toString()
        return sql.substring(0, sql.length - 1) + ")"
    }

    fun getIndexCreator(): String {
        return "create index $TABLE_TEST_INDEX on $TABLE_NAME (${TestColumn.COLUMN_ID.key})"
    }
    
    fun insert(data: TestDataStruct?): Long {
        if (data == null) {
            Log.d(TAG, "insert invalid params, data: $data")
        }
        var rowid: Long = -1
        DBManager.beginTransaction()
        rowid = DBManager.insert(TABLE_NAME, null, buildValues(data!!))
        DBManager.endTransaction()
        return rowid
    }
    
    fun delete(tableName: String?, whereClause: String?, whereArgs: Array<String>?): Int {
        if (tableName.isNullOrEmpty()) {
            Log.d(TAG, "delete invalid params, tableName: $tableName")
        }
        var rows: Int = -1
        DBManager.beginTransaction()
        rows = DBManager.delete(tableName, whereClause, whereArgs)
        DBManager.endTransaction()
        return rows
    }

    private fun buildValues(data: TestDataStruct): ContentValues {
        return ContentValues()?.apply {
            put(TestColumn.COLUMN_ID.key, data.id)
            put(TestColumn.COLUMN_AAA.key, "aaa${data.id}")
            put(TestColumn.COLUMN_BBB.key, "bbb${data.id}")
            put(TestColumn.COLUMN_CCC.key, "ccc${data.id}")
            put(TestColumn.COLUMN_DDD.key, data.id * 2)
            put(TestColumn.COLUMN_EEE.key, "eee${data.id}")
            put(TestColumn.COLUMN_FFF.key, "fff${data.id}")
            put(TestColumn.COLUMN_GGG.key, "ggg${data.id}")
            put(TestColumn.COLUMN_HHH.key, data.id * 3)
            put(TestColumn.COLUMN_III.key, "iii${data.id}")
            put(TestColumn.COLUMN_JJJ.key, "jjj${data.id}")
            put(TestColumn.COLUMN_KKK.key, "kkk${data.id}")
            put(TestColumn.COLUMN_LLL.key, data.id * 4)
            put(TestColumn.COLUMN_MMM.key, "mmm${data.id}")
            put(TestColumn.COLUMN_NNN.key, "nnn${data.id}")
            put(TestColumn.COLUMN_OOO.key, "ooo${data.id}")
            put(TestColumn.COLUMN_PPP.key, "ppp${data.id}")
            put(TestColumn.COLUMN_QQQ.key, data.id * 5)
            put(TestColumn.COLUMN_RRR.key, "rrr${data.id}")
            put(TestColumn.COLUMN_SSS.key, "sss${data.id}")
            put(TestColumn.COLUMN_TTT.key, "ttt${data.id}")
            put(TestColumn.COLUMN_UUU.key, data.id * 6)
            put(TestColumn.COLUMN_VVV.key, "vvv${data.id}")
            put(TestColumn.COLUMN_WWW.key, "www${data.id}")
            put(TestColumn.COLUMN_XXX.key, "xxx${data.id}")
            put(TestColumn.COLUMN_YYY.key, "yyy${data.id}")
            put(TestColumn.COLUMN_ZZZ.key, data.id * 7)
        }
    }
}