package ru.steelwave.unotes.presentation.main.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.steelwave.unotes.R
import ru.steelwave.unotes.databinding.FragmentHomeNewBinding

class HomeNewFragment : Fragment() {

    private var _binding: FragmentHomeNewBinding? = null
    private val binding: FragmentHomeNewBinding
    get() = _binding ?: throw RuntimeException("FragmentHomeNewBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentHomeNewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun getInstance(): HomeNewFragment{
            return HomeNewFragment()
        }
    }
}