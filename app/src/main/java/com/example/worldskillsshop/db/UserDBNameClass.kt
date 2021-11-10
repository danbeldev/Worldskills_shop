package com.example.worldskillsshop.db

import android.provider.BaseColumns

object UserDBNameClass {

    const val TABLE_USER = "User"

    const val NAME = "name"
    const val EMAIL = "email"
    const val PASSWORD = "password"
    const val ID = BaseColumns._ID

    const val DATABASE_VERSION = 7  //версия
    const val DATABASE_NAME = "UserDb.db"  //Название

    const val CREAT_TABLE = "CREATE TABLE IF NOT EXISTS $TABLE_USER("+
            "${BaseColumns._ID} INTEGER PRIMARY KEY,$NAME TEXT,$EMAIL TEXT,$PASSWORD TEXT)"
    const val SQL_DELETE_TABLE = "DROP TABLE IF EXISTS $TABLE_USER"
}