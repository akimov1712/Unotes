package ru.steelwave.unotes.presentation

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.steelwave.unotes.R
import ru.steelwave.unotes.databinding.FragmentInformationBinding


class InformationFragment : Fragment() {

    private var _binding: FragmentInformationBinding? = null
    private val binding: FragmentInformationBinding
    get() = _binding ?: throw RuntimeException("FragmentInformationBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInformationBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        settingView()
    }
    private fun settingView() {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}