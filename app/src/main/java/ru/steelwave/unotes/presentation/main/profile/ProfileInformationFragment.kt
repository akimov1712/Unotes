package ru.steelwave.unotes.presentation.main.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isInvisible
import androidx.fragment.app.Fragment
import ru.steelwave.unotes.R
import ru.steelwave.unotes.databinding.FragmentProfileInformationBinding


class ProfileInformationFragment : Fragment() {

    private var _binding: FragmentProfileInformationBinding? = null
    private val binding: FragmentProfileInformationBinding
    get() = _binding ?: throw RuntimeException("FragmentProfileInformationBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentProfileInformationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewAboutLevel()
    }

    private fun setupViewAboutLevel(){
        binding.btnToggleAboutLevel.setOnClickListener {
            val aboutLevelText = binding.textInformationAboutLevel
            if (aboutLevelText.visibility == View.GONE){
                aboutLevelText.visibility = View.VISIBLE
                binding.btnToggleAboutLevel.setImageResource(R.drawable.icon_close)
            } else {
                aboutLevelText.visibility = View.GONE
                binding.btnToggleAboutLevel.setImageResource(R.drawable.icon_open)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        fun getInstance():Fragment{
            return ProfileInformationFragment()
        }
    }

}