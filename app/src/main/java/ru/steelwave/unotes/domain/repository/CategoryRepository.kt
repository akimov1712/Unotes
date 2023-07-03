package ru.steelwave.unotes.domain.repository

import androidx.lifecycle.LiveData
import ru.steelwave.unotes.domain.entity.CategoryModel
import ru.steelwave.unotes.domain.entity.NoteModel

interface CategoryRepository {

    fun getCategoryList(): LiveData<List<CategoryModel>>
    fun getNoteListCategory(id: Int): LiveData<List<NoteModel>>

}