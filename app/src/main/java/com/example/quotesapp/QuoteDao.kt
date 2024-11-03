package com.example.quotesapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface QuoteDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertQuote(dataEntity: DataEntity)

    @Delete
    suspend fun deleteQuote(dataEntity: DataEntity)

    @Update
    suspend fun updateQuote(dataEntity: DataEntity)

    @Query("SELECT * FROM quotes_table ORDER BY date DESC")
    fun getAllQuotes(): List<DataEntity>

}