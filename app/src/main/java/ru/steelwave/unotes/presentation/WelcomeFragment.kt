package ru.steelwave.unotes.presentation

import android.content.res.Resources
import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.steelwave.unotes.R
import ru.steelwave.unotes.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null
    private val binding: FragmentWelcomeBinding
        get() = _binding ?: throw RuntimeException("WelcomeFragmentBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        settingView()
        setListeners()
    }

    private fun setListeners() {
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToLoginFragment())
        }
        binding.btnRegistration.setOnClickListener {
            findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToRegistrationFragment())
        }
    }

    private fun setUnotesColorRed() {
        val fullText = requireContext().getText(R.string.welcome_to_UNotes)
        val highlightedText = "UNotes"

        val spannableString = SpannableString(fullText)
        val foregroundColorSpan =
            ForegroundColorSpan(requireContext().getColor(R.color.secondary_color))

        spannableString.setSpan(
            foregroundColorSpan,
            fullText.indexOf(highlightedText),
            fullText.indexOf(highlightedText) + highlightedText.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        binding.tvWelcomeToUnotes.text = spannableString
    }

    private fun settingView() {
        setUnotesColorRed()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}