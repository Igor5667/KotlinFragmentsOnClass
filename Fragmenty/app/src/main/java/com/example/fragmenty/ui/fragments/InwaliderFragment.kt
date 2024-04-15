package com.example.fragmenty.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.fragmenty.R
import com.example.fragmenty.viewmodel.SharedViewModel

//ARROW

class InwaliderFragment: Fragment() {
    private val viewModel:SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_inwalider, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.textview_msg)

        //obserwowanie zmian
        viewModel.selectedMessage.observe(viewLifecycleOwner){message ->
            textView.text = message
        }
    }

}