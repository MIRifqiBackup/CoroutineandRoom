package com.mobile.miftakhulilmanrifqi.a205410082.coroutineandroom

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.mobile.miftakhulilmanrifqi.a205410082.coroutineandroom.catatan.Note
import com.mobile.miftakhulilmanrifqi.a205410082.coroutineandroom.catatan.NoteRepository

class NoteViewModel(application: Application) : AndroidViewModel(application) {
    private var repository: NoteRepository =
        NoteRepository(application)
    private var allNotes: LiveData<List<Note>> = repository.getAllNotes()

    fun insert(note: Note) {
        repository.insert(note)
    }

    fun update(note: Note) {
        repository.update(note)
    }

    fun delete(note: Note) {
        repository.delete(note)
    }

    fun deleteAllNotes() {
        repository.deleteAllNotes()
    }

    fun getAllNotes(): LiveData<List<Note>> {
        return allNotes
    }
}
