package ru.steelwave.unotes.presentation.main.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import ru.steelwave.unotes.R
import ru.steelwave.unotes.databinding.FragmentHomeBinding
import ru.steelwave.unotes.presentation.main.profile.ProfileActionFragment
import ru.steelwave.unotes.presentation.main.profile.ProfileInformationFragment
import ru.steelwave.unotes.presentation.main.profile.ProfilePageAdapter
import ru.steelwave.unotes.presentation.main.profile.ProfileSettingsFragment


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding
    get() = _binding ?: throw RuntimeException("FragmentHomeBinding == null")

    private lateinit var pageAdapter: HomePageAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager(){

        val homeNew = HomeNewFragment.getInstance()
        val homePopular = HomePopularFragment.getInstance()
        val homeInteresting = HomeInterestingFragment.getInstance()
        if (true){
            val listFragment = listOf(homeNew, homePopular,homeInteresting)
            pageAdapter = HomePageAdapter(listFragment, childFragmentManager, lifecycle)
            with(binding){
                containerHomeFragment.adapter = pageAdapter
                tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
                    override fun onTabSelected(tab: TabLayout.Tab?) {
                        if (tab != null) {
                            containerHomeFragment.currentItem = tab.position
                        }
                    }

                    override fun onTabUnselected(tab: TabLayout.Tab?) {

                    }

                    override fun onTabReselected(tab: TabLayout.Tab?) {

                    }
                })
            }
        }
        binding.containerHomeFragment.registerOnPageChangeCallback(
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