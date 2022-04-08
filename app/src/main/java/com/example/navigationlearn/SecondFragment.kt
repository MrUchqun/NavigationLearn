package com.example.navigationlearn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.navigationlearn.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {

    private val binding by viewBinding { FragmentSecondBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        Toast.makeText(requireContext(), arguments?.getString("key"), Toast.LENGTH_SHORT).show()
        Toast.makeText(
            requireContext(),
            arguments?.getSerializable("user").toString(),
            Toast.LENGTH_SHORT
        ).show()

        binding.doNotClick.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }
    }

}