package com.axell.navigtionsample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.axell.navigtionsample.databinding.FragmentDBinding


class FragmentD : Fragment() {
    private var _binding: FragmentDBinding? = null
    private val binding get() = _binding!!

    val args: FragmentDArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.stepItemId.text = args.stepItemId
    }

}