package ru.steelwave.unotes.presentation.splash

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.steelwave.unotes.Const
import ru.steelwave.unotes.R
import ru.steelwave.unotes.databinding.FragmentRegistrationBinding
import ru.steelwave.unotes.presentation.RegistrationFragmentDirections

class RegistrationFragment : Fragment() {

    private var _binding: FragmentRegistrationBinding? = null
    private val binding: FragmentRegistrationBinding
        get() = _binding ?: throw RuntimeException("FragmentRegistrationBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        settingView()
        binding.btnNext.setOnClickListener {
            findNavController().navigate(RegistrationFragmentDirections.actionRegistrationFragmentToInformationFragment())
        }
    }

    private fun setRules() {
        val fullText = requireContext().getString(R.string.rules)
        val privacyPolicyText = requireContext().getString(R.string.privacy_policy)
        val personalDataText = requireContext().getString(R.string.personal_data)

        val spannableString = SpannableString(fullText)

        val personalDataClickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(Const.PERSONAL_DATA_LINK))
                startActivity(intent)
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = true
                ds.color = requireContext().getColor(R.color.secondary_color)
            }
        }

        val privacyPolicyClickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(Const.PRIVACY_POLICY_LINK))
                startActivity(intent)
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = true
                ds.color = requireContext().getColor(R.color.secondary_color)
            }
        }

        val personalDataStartIndex = fullText.indexOf(personalDataText)
        val personalDataEndIndex = personalDataStartIndex + personalDataText.length
        spannableString.setSpan(personalDataClickableSpan, personalDataStartIndex, personalDataEndIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        val privacyPolicyStartIndex = fullText.indexOf(privacyPolicyText)
        val privacyPolicyEndIndex = privacyPolicyStartIndex + privacyPolicyText.length
        spannableString.setSpan(privacyPolicyClickableSpan, privacyPolicyStartIndex, privacyPolicyEndIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.tvRules.text = spannableString
        binding.tvRules.movementMethod = LinkMovementMethod.getInstance()
    }

    private fun settingView() {
        setRules()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}