package ru.steelwave.unotes.presentation.main

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ru.steelwave.unotes.domain.entity.NoteModel
import ru.steelwave.unotes.presentation.main.profile.NoteViewHolder

class NoteAdapter: ListAdapter<NoteModel, NoteViewHolder>(NoteDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}