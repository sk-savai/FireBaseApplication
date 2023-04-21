package com.example.firebaseapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.firebaseapplication.R
import com.example.firebaseapplication.databinding.FragmentHomeBinding
import com.example.firebaseapplication.databinding.FragmentMyAccountBinding


class MyAccountFragment : Fragment() {

    private lateinit var binding: FragmentMyAccountBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_my_account,container,false)
        return binding.root

    }

}