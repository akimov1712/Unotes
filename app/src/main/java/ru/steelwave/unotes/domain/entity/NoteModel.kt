package ru.steelwave.unotes.domain.entity

data class NoteModel(
     var id: Int = UNDEFINED_ID,
     val alias: String,
     val authorId: Int? = null,
     val datePublish: Long,
     val categoryId: Int? = null,
     val noteTitle: String,
     val noteContent: String,
     val popularity: String

){
  companion object{
     const val UNDEFINED_ID = 0
  }
}