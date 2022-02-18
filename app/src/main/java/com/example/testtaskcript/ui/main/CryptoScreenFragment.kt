package com.example.testtaskcript.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testtaskcript.R

class CryptoScreenFragment : Fragment() {

    companion object {
        fun newInstance() = CryptoScreenFragment()
    }

    private lateinit var viewModel: CryptoScreenViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CryptoScreenViewModel::class.java)
        // TODO: Use the ViewModel
    }

}