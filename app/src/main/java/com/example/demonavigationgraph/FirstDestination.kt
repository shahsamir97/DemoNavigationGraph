package com.example.demonavigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.demonavigationgraph.databinding.FragmentFirstDestinationBinding

/**
 * A simple [Fragment] subclass.
 */
class FirstDestination : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       var binding : FragmentFirstDestinationBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_first_destination, container, false)
        binding.button.setOnClickListener { view : View -> view.findNavController().navigate(R.id.action_firstDestination_to_secondDestination) }
        return binding.root
    }

}
