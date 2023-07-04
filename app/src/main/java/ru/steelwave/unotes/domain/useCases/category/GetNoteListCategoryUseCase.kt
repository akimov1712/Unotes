package ru.steelwave.unotes.domain.useCases.category

import androidx.lifecycle.LiveData
import ru.steelwave.unotes.domain.entity.NoteModel
import ru.steelwave.unotes.domain.repository.CategoryRepository

class GetNoteListCategoryUseCase(private val repository: CategoryRepository) {

    operator fun invoke(categoryId: Int): LiveData<List<NoteModel>>{
        return repository.getNoteListCategory(categoryId)
    }

}