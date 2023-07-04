package ru.steelwave.unotes.domain.useCases.note

import ru.steelwave.unotes.domain.repository.NotesRepository

class GetNoteItemUseCase(private val repository: NotesRepository)  {

    suspend operator fun invoke(id: Int){
        repository.getNoteItem(id)
    }

}