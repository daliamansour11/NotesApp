package com.example.keepnotes.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
@Entity(tableName = "NOTE_TABLE")
data class NoteEntity(

    @PrimaryKey(autoGenerate = true)
    var id:    Long,

    @ColumnInfo(name = "content")
    var content: String,

    @ColumnInfo(name = "tittle")
    var title:String,

    @ColumnInfo(name = "date")
    var date: String,

    @ColumnInfo(name = "img_path")
    var imagepath:String,

    @ColumnInfo(name = "web_link")
    var webLink:String,

    @ColumnInfo(name = "color")
    var color :String,

    ): Serializable
