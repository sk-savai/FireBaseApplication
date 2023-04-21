package com.example.firebaseapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.firebaseapplication.R
import com.example.firebaseapplication.databinding.FragmentLoginBinding
import com.example.firebaseapplication.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{

        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_sign_up,container,false)

        onClickEvents()

        return binding.root

    }


    private fun onClickEvents(){

        binding.btnSignUp.setOnClickListener {
            val action=SignUpFragmentDirections.actionSignUpFragmentToLoginFragment()
            findNavController().navigate(action)
        }


    }

}