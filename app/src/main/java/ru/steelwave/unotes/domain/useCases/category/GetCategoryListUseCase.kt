package ru.steelwave.unotes.domain.useCases.category

import androidx.lifecycle.LiveData
import ru.steelwave.unotes.domain.entity.CategoryModel
import ru.steelwave.unotes.domain.repository.CategoryRepository

class GetCategoryListUseCase(private val repository: CategoryRepository) {

    operator fun invoke(): LiveData<List<CategoryModel>>{
        return repository.getCategoryList()
    }

}