package com.example.quotesapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [DataEntity::class],
version =1,
exportSchema = true)

@TypeConverters (DateConvertor::class)
abstract class QuoteDatabase : RoomDatabase() {

    abstract fun getQuoteDao(): QuoteDao
    private var INSTANCE:QuoteDatabase?=null

    fun getDatabase(context: Context): QuoteDatabase{
        if(INSTANCE!=null){
            INSTANCE = Room.databaseBuilder(context.applicationContext, QuoteDatabase::class.java, "quotes_database").build()
        }
        return INSTANCE!!
    }


}