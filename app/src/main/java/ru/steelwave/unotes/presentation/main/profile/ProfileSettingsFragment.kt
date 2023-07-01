package ru.steelwave.unotes.presentation.main.profile

import android.os.Bundle
import android.print.PrintAttributes.Margins
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.google.android.material.internal.CheckableImageButton
import ru.steelwave.unotes.R
import ru.steelwave.unotes.databinding.FragmentProfileSettingsBinding


class ProfileSettingsFragment : Fragment() {

    private var _binding: FragmentProfileSettingsBinding? = null
    private val binding: FragmentProfileSettingsBinding
    get() = _binding ?: throw  RuntimeException("FragmentProfileSettingsBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentProfileSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupStartIcon()
    }

    private fun setupStartIcon(){
        val startIcon: CheckableImageButton =
            binding.tilAboutMe.findViewById(com.google.android.material.R.id.text_input_start_icon)

        val layoutParams = startIcon.layoutParams as LinearLayout.LayoutParams
        layoutParams.apply {
            topMargin = 18
            gravity = Gravity.TOP or Gravity.LEFT
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        fun getInstance():Fragment{
            return ProfileSettingsFragment()
        }
    }

}