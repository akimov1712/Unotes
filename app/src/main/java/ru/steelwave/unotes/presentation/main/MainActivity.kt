package ru.steelwave.unotes.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import ru.steelwave.unotes.R
import ru.steelwave.unotes.databinding.ActivityMainBinding
import ru.steelwave.unotes.presentation.main.profile.ProfileFragment

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(findViewById(R.id.toolbar))
        navigationBottomMenu()
    }

    private fun navigationBottomMenu() {
        val navController = findNavController(R.id.container)
        val appBarConfigurator = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.notebookFragment,
                R.id.detailNoteFragment,
                R.id.categoryFragment,
                R.id.profileFragment)
        )
        setupActionBarWithNavController(navController, appBarConfigurator)
        binding.bottomMenu.setupWithNavController(navController)
    }

}