package ru.steelwave.unotes.domain.entity

import ru.steelwave.unotes.Const

data class NoteModel(
    var id: Int = Const.UNDEFINED_ID,
    val alias: String,
    val authorId: Int? = null,
    val datePublish: Long,
    val categoryId: Int? = null,
    val noteTitle: String,
    val noteContent: String,
    val popularity: String

)