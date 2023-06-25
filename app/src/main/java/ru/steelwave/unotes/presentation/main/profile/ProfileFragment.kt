package ru.steelwave.unotes.presentation.main.profile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.steelwave.unotes.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding: FragmentProfileBinding
    get() = _binding ?: throw RuntimeException("FragmentProfileBinding == null")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentProfileBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}