package com.example.demonavigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.demonavigationgraph.databinding.FragmentSecondDestinationBinding


/**
 * A simple [Fragment] subclass.
 */
class SecondDestination : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentSecondDestinationBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_second_destination,container, false)
        val args = SecondDestinationArgs.fromBundle(requireArguments())
        binding.nameText.text = args.name
        binding.ageText.text = args.age

        return binding.root
    }

}
