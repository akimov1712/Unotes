package ru.steelwave.unotes.domain.useCases.note

import androidx.lifecycle.LiveData
import ru.steelwave.unotes.domain.entity.NoteModel
import ru.steelwave.unotes.domain.repository.NotesRepository

class GetNoteListUseCase(private val repository: NotesRepository)  {

    operator fun invoke(): LiveData<List<NoteModel>>{
        return repository.getNoteList()
    }

}