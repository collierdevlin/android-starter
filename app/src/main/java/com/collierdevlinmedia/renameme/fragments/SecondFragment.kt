package com.collierdevlinmedia.renameme.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.collierdevlinmedia.renameme.GenericViewModel
import com.collierdevlinmedia.renameme.R
import com.collierdevlinmedia.renameme.databinding.FragmentSecondBinding


class SecondFragment : Fragment(R.layout.fragment_second) {

    private lateinit var binding: FragmentSecondBinding

    private val genericViewModel: GenericViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.inflate(layoutInflater)

        view.findViewById<Button>(R.id.btnPrev).setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_secondFragment_to_firstFragment)
        }
    }

}