package com.example.tugas10.catatan

import androidx.lifecycle.LiveData
import androidx.room.*

// Data Access Object
@Dao
interface NoteDao {
    @Insert
    fun insert(note: Note)
    @Update
    fun update(note: Note)
    @Delete
    fun delete(note: Note)
    @Query("DELETE FROM note_table")
    fun deleteAllNotes()
    @Query("SELECT * FROM note_table ORDER BY stock DESC")
    fun getAllNotes(): LiveData<List<Note>>
}
