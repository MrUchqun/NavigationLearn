package com.example.navigationlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navigationlearn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = findNavController(R.id.nav_host_main)

        binding.bnvMain.setupWithNavController(navController)

         /* binding.bnvMain.setOnItemSelectedListener {
              when (it.itemId) {
                  R.id.homeFragment -> navController.navigate(R.id.homeFragment)
                  R.id.secondFragment -> navController.navigate(R.id.secondFragment)
              }
              true
          }*/


    }


}