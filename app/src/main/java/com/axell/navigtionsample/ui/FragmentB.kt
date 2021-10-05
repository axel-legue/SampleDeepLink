package com.axell.navigtionsample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.axell.navigtionsample.R
import com.axell.navigtionsample.databinding.FragmentABinding
import com.axell.navigtionsample.databinding.FragmentBBinding

class FragmentB : Fragment() {


    private var _binding: FragmentBBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonB.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentB_to_fragmentC)
        }
    }
}