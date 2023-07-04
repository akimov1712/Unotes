package ru.steelwave.unotes.presentation.main

import androidx.recyclerview.widget.DiffUtil
import ru.steelwave.unotes.domain.entity.NoteModel

class NoteDiffCallback:DiffUtil.ItemCallback<NoteModel>() {

    override fun areItemsTheSame(oldItem: NoteModel, newItem: NoteModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: NoteModel, newItem: NoteModel): Boolean {
        return oldItem == newItem
    }
}