package ru.steelwave.unotes.presentation.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.steelwave.unotes.databinding.FragmentInformationInRegistrationBinding


class InformationInRegistrationFragment : Fragment() {

    private var _binding: FragmentInformationInRegistrationBinding? = null
    private val binding: FragmentInformationInRegistrationBinding
        get() = _binding ?: throw RuntimeException("FragmentInformationBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInformationInRegistrationBinding.inflate(inflater)
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