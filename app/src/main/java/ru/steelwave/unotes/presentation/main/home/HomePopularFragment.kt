package ru.steelwave.unotes.presentation.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.steelwave.unotes.databinding.FragmentHomePopularBinding


class HomePopularFragment : Fragment() {

    private var _binding: FragmentHomePopularBinding? = null
    private val binding: FragmentHomePopularBinding
        get() = _binding ?: throw RuntimeException("FragmentHomePopularBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentHomePopularBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun getInstance(): HomePopularFragment {
            return HomePopularFragment()
        }
    }
}