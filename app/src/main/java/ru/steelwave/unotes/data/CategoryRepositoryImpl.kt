package ru.steelwave.unotes.data

import androidx.lifecycle.LiveData
import ru.steelwave.unotes.domain.entity.CategoryModel
import ru.steelwave.unotes.domain.entity.NoteModel
import ru.steelwave.unotes.domain.repository.CategoryRepository

object CategoryRepositoryImpl: CategoryRepository {

    override fun getCategoryList(): LiveData<List<CategoryModel>> {
        TODO("Not yet implemented")
    }

    override fun getNoteListCategory(id: Int): LiveData<List<NoteModel>> {
        TODO("Not yet implemented")
    }
}