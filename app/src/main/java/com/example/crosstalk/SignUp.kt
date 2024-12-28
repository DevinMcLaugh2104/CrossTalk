package com.example.crosstalk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.crosstalk.databinding.SignUpFragmentBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SignUp : Fragment() {

    private var _binding: SignUpFragmentBinding? = null
    private val binding get() = _binding!!

    private var fullName: String? = null
    private var userName: String? = null
    private var password: String? = null
    private var confirmPassword: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = SignUpFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backButton.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}