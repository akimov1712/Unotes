package ru.steelwave.unotes.domain.repository

import androidx.lifecycle.LiveData
import ru.steelwave.unotes.domain.entity.NoteModel

interface NotesRepository {

    fun getNoteList(): LiveData<List<NoteModel>>
    suspend fun getNoteItem(id: Int): NoteModel
    suspend fun addNoteItem(note: NoteModel)
    suspend fun editNoteItem(note: NoteModel)

}