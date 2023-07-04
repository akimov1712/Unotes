package ru.steelwave.unotes.data

import ru.steelwave.unotes.domain.entity.CommentModel
import ru.steelwave.unotes.domain.repository.CommentRepository

object CommentRepositoryImpl: CommentRepository {

    override suspend fun getCommentItem(id: Int): CommentModel {
        TODO("Not yet implemented")
    }

    override suspend fun addComment(comment: CommentModel) {
        TODO("Not yet implemented")
    }

    override suspend fun editComment(comment: CommentModel) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteComment(comment: CommentModel) {
        TODO("Not yet implemented")
    }
}