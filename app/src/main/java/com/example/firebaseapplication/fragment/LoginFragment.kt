package com.example.firebaseapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.firebaseapplication.R
import com.example.firebaseapplication.databinding.FragmentLoginBinding
import com.example.firebaseapplication.utils.Validation

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        onClickEvents()

        return binding.root

    }


    private fun onClickEvents() {

        binding.tvSignUpHere.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToSignUpFragment()
            findNavController().navigate(action)
        }

        binding.btnLogin.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment()
            findNavController().navigate(action)

        }
    }

    private fun validation() {
        when {
            !Validation.isFieldNull(binding.etEmail.toString()) -> {
                Toast.makeText(requireContext(), "Enter Email", Toast.LENGTH_SHORT).show()
            }
            Validation.isEmailValid(binding.etEmail.toString()) -> {
                Toast.makeText(
                    requireContext(), "Please Enter Valid Email", Toast.LENGTH_SHORT
                ).show()
            }
            Validation.isFieldNull(binding.etPassword.toString()) -> {
                Toast.makeText(
                    requireContext(), "Please Enter Password", Toast.LENGTH_SHORT
                ).show()
            }
            Validation.isValidPassword(binding.etPassword.toString()) -> {
                Toast.makeText(
                    requireContext(), "Please Enter Valid Password", Toast.LENGTH_SHORT
                ).show()
            }
            else -> {
                val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment()
                findNavController().navigate(action)
            }
        }
    }

}