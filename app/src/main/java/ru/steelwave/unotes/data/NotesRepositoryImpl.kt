package ru.steelwave.unotes.data

import androidx.lifecycle.LiveData
import ru.steelwave.unotes.domain.entity.NoteModel
import ru.steelwave.unotes.domain.repository.NotesRepository

object NotesRepositoryImpl:NotesRepository {

    override fun getNoteList(): LiveData<List<NoteModel>> {
        TODO("Not yet implemented")
    }

    override suspend fun getNoteItem(id: Int): NoteModel {
        TODO("Not yet implemented")
    }

    override suspend fun addNoteItem(note: NoteModel) {
        TODO("Not yet implemented")
    }

    override suspend fun editNoteItem(note: NoteModel) {
        TODO("Not yet implemented")
    }
}