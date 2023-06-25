package ru.steelwave.unotes.presentation.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.steelwave.unotes.R
import ru.steelwave.unotes.databinding.FragmentNotesInCategoryBinding


class NotesInCategoryFragment : Fragment() {

    private var _binding: FragmentNotesInCategoryBinding? = null
    private val binding: FragmentNotesInCategoryBinding
    get() = _binding ?: throw RuntimeException("FragmentNotesInCategoryBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentNotesInCategoryBinding.inflate(layoutInflater)
        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}