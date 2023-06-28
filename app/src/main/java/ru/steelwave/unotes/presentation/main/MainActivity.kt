package ru.steelwave.unotes.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import ru.steelwave.unotes.R
import ru.steelwave.unotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val customMenu by lazy{
        PopupMenu(this, binding.ivToogleOpenOrCloseMenu)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(findViewById(R.id.toolbar))
        navigationBottomMenu()
        setupModalMainMenu()
    }

    private fun setupModalMainMenu() {
        binding.btnOpenMenuToolbar.setOnClickListener {
            val state = customMenu.isShowing()
            if (!state){
                binding.ivToogleOpenOrCloseMenu.setImageDrawable(getDrawable(R.drawable.icon_close))
                customMenu.showMenu(it)
            } else{
                binding.ivToogleOpenOrCloseMenu.setImageDrawable(getDrawable(R.drawable.icon_open))
                customMenu.hideMenu()
            }
        }
    }

    private fun navigationBottomMenu() {
        val navController = findNavController(R.id.container)
        val appBarConfigurator = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.notebookFragment,
                R.id.detailNoteFragment,
                R.id.categoryFragment,
                R.id.profileFragment
            )
        )
        setupActionBarWithNavController(navController, appBarConfigurator)
        binding.bottomMenu.setupWithNavController(navController)
    }

    override fun onBackPressed() {
        if (customMenu.isShowing()) {
            customMenu.hideMenu()
        } else {
            super.onBackPressed()
        }
    }
}