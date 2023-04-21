package com.example.firebaseapplication.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.firebaseapplication.R
import com.example.firebaseapplication.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        val navHostFragment=supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        val navController=navHostFragment.navController

        val bottomNavigation= findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigation.setupWithNavController(navController)


        navController.addOnDestinationChangedListener(listener = NavController.OnDestinationChangedListener { controller, destination, arguments ->

            when(destination.id){

                R.id.menuHome->{
                    showBottom()
                }
                R.id.menuCategory->{
                    showBottom()
                }
                R.id.menuSetting->{
                    showBottom()
                }
                R.id.menuMyAccount->{
                    showBottom()
                }
                else->{
                    hideBottom()
                }
            }

        })
    }

    private fun showBottom(){
        binding.bottomNavigation.isVisible=true
    }

    private fun hideBottom(){
        binding.bottomNavigation.isVisible=false
    }



}