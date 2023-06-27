package ru.steelwave.unotes.presentation.main.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.steelwave.unotes.databinding.FragmentProfileActionBinding


class ProfileActionFragment : Fragment() {

    private var _binding: FragmentProfileActionBinding? = null
    private val binding: FragmentProfileActionBinding
        get() = _binding ?: throw RuntimeException("FragmentProfileActionBinding? == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentProfileActionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}