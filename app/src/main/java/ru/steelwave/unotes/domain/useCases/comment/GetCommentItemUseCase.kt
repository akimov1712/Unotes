package ru.steelwave.unotes.domain.useCases.comment

import ru.steelwave.unotes.domain.entity.CommentModel
import ru.steelwave.unotes.domain.repository.CommentRepository

class GetCommentItemUseCase(private val repository: CommentRepository) {

    suspend operator fun invoke(id: Int): CommentModel{
        return repository.getCommentItem(id)
    }

}