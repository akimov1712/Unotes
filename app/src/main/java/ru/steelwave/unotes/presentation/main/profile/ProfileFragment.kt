package ru.steelwave.unotes.presentation.main.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.steelwave.unotes.R
import ru.steelwave.unotes.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding: FragmentProfileBinding
    get() = _binding ?: throw RuntimeException("FragmentProfileBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentProfileBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupButtonListeners()
    }

    private fun setupButtonListeners(){
        with(binding){
            btnInformation.setOnClickListener{
                findNavController().navigate(R.id.profileInformationFragment)
            }
            btnMySettings.setOnClickListener{
                findNavController().navigate(R.id.profileSettingsFragment)
            }
        }
    }

    private fun navigateToFragment(actionId: Int) {
        with(binding){
            when (actionId) {
                R.id.btn_information -> {
                    btnInformation.isEnabled = false
                    btnMySettings.isEnabled = true
                }
                R.id.btn_my_settings -> {
                    btnInformation.isEnabled = true
                    btnMySettings.isEnabled = false
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}