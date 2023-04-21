package com.example.firebaseapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.firebaseapplication.R
import com.example.firebaseapplication.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)
        binding.btnMotionLayout.setOnClickListener {
            val action = HomeFragmentDirections.actionMenuHomeToMotionLayoutFragment()
            findNavController().navigate(action)
        }

        binding.btnMotionYouTube.setOnClickListener {
            val action = HomeFragmentDirections.actionMenuHomeToYouTubeMotionLayoutFragment()
            findNavController().navigate(action)
        }

        return binding.root
    }


}