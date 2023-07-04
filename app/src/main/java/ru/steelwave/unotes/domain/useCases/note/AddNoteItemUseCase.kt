package ru.steelwave.unotes.domain.useCases.note

import ru.steelwave.unotes.domain.entity.NoteModel
import ru.steelwave.unotes.domain.repository.NotesRepository

class AddNoteItemUseCase(private val repository: NotesRepository) {

    suspend operator fun invoke(note: NoteModel){
        repository.addNoteItem(note)
    }

}