package ru.steelwave.unotes.presentation.main.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.steelwave.unotes.R
import ru.steelwave.unotes.databinding.FragmentHomeInterestingBinding
import ru.steelwave.unotes.databinding.FragmentHomePopularBinding


class HomeInterestingFragment : Fragment() {

    private var _binding: FragmentHomeInterestingBinding? = null
    private val binding: FragmentHomeInterestingBinding
        get() = _binding ?: throw RuntimeException("FragmentHomeInterestingBinding == null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentHomeInterestingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun getInstance(): HomeInterestingFragment {
            return HomeInterestingFragment()
        }
    }

}