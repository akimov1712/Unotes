package ru.steelwave.unotes.domain.repository

import ru.steelwave.unotes.domain.entity.CommentModel

interface CommentRepository {

    suspend fun getCommentItem(id: Int): CommentModel
    suspend fun addComment(comment: CommentModel)
    suspend fun editComment(comment: CommentModel)
    suspend fun deleteComment(comment: CommentModel)

}