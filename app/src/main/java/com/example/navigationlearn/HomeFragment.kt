package com.example.navigationlearn

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationlearn.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding { FragmentHomeBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.clickMe.setOnClickListener {
            findNavController().navigate(
                R.id.action_homeFragment_to_secondFragment,
                bundleOf("key" to "value", "user" to User("Bekhruzbek", 21)),
                // for animation 
                Utils.navOptions()
            )
        }

    }

}