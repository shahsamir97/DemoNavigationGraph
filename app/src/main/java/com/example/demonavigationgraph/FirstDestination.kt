package com.example.demonavigationgraph

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.demonavigationgraph.databinding.FragmentFirstDestinationBinding
import kotlinx.android.synthetic.main.fragment_first_destination.*

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
        binding.button.setOnClickListener {
                view : View -> view.findNavController().navigate(FirstDestinationDirections
            .actionFirstDestinationToSecondDestination(binding.nameEditText.text.toString(),binding.ageEditText.text.toString()))
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
    }

}
