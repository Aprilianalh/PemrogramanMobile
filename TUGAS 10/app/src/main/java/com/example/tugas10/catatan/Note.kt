package com.example.tugas10.catatan

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class Note(
    var title: String,
    var category: String,
    var indication: String,
    var stock: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
