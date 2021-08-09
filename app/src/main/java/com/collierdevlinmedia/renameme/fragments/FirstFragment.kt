package com.collierdevlinmedia.renameme.fragments

import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.collierdevlinmedia.renameme.GenericViewModel
import com.collierdevlinmedia.renameme.R
import com.collierdevlinmedia.renameme.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var binding: FragmentFirstBinding

    private val genericViewModel: GenericViewModel by activityViewModels()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.inflate(layoutInflater)

        view.findViewById<Button>(R.id.btnNext).setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }
}