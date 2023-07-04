package ru.steelwave.unotes.domain.useCases.comment

import ru.steelwave.unotes.domain.entity.CommentModel
import ru.steelwave.unotes.domain.repository.CommentRepository

class EditCommentUseCase(private val repository: CommentRepository) {

    suspend operator fun invoke(editedComment: CommentModel){
        repository.editComment(editedComment)
    }

}