package com.example.keepnotes.Database

import android.content.Context
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteOpenHelper
@Database(
    entities = arrayOf(NoteEntity::class), version = 1, exportSchema = false
)
abstract class NoteDataBase:RoomDatabase() {

    abstract fun getAllNote():NoteDAO

    companion object{
        @Volatile
        var INSTANCE :NoteDataBase? =null
        fun getInstance(context: Context):NoteDataBase{
            val tempInstance  = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NoteDataBase::class.java,
                    "note_database"
                ).build()
                INSTANCE = instance
                return  instance
            }
        }
    }
}