package com.axell.navigtionsample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkBuilder
import com.axell.navigtionsample.R
import com.axell.navigtionsample.databinding.FragmentCBinding

class FragmentC : Fragment() {

    private var _binding: FragmentCBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.deeplink.setOnClickListener {

            NavDeepLinkBuilder(requireContext())
                .setGraph(R.navigation.main_navigation)
                .setDestination(R.id.fragmentD)
                .setArguments(bundleOf("stepItemId" to "8"))
                .createTaskStackBuilder()
        }
    }

}