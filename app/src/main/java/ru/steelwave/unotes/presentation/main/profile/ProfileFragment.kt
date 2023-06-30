package ru.steelwave.unotes.presentation.main.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import ru.steelwave.unotes.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding: FragmentProfileBinding
    get() = _binding ?: throw RuntimeException("FragmentProfileBinding == null")

    private lateinit var pageAdapter: ProfilePageAdapter

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
        setupViewPager()

    }

    private fun setupViewPager(){

        val profileSettings = ProfileSettingsFragment.getInstance()
        val profileInformation = ProfileInformationFragment.getInstance()
        val profileAction = ProfileActionFragment.getInstance()
        if (true){
            val listFragment = listOf<Fragment>(profileInformation, profileSettings)
            pageAdapter = ProfilePageAdapter(listFragment, childFragmentManager, lifecycle)
            with(binding){
                containerProfileFragment.adapter = pageAdapter
                tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
                    override fun onTabSelected(tab: TabLayout.Tab?) {
                        if (tab != null) {
                            containerProfileFragment.currentItem = tab.position
                        }
                    }

                    override fun onTabUnselected(tab: TabLayout.Tab?) {

                    }

                    override fun onTabReselected(tab: TabLayout.Tab?) {

                    }
                })
            }
        }
        binding.containerProfileFragment.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                with(binding){
                    tabLayout.selectTab(tabLayout.getTabAt(position))
                }
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}