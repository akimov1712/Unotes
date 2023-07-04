package ru.steelwave.unotes.domain.useCases.note

import ru.steelwave.unotes.domain.entity.NoteModel
import ru.steelwave.unotes.domain.repository.NotesRepository

class EditNoteItemUseCase(private val repository: NotesRepository)  {

    suspend operator fun invoke(editedNote: NoteModel){
        repository.editNoteItem(editedNote)
    }

}