package com.example.testtaskcript.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testtaskcript.databinding.CryptoFragmentBinding
import common.App
import model.dbModels.CryptoModel

class CryptoScreenFragment : Fragment() {

    private lateinit var viewModel: CryptoScreenViewModel
    private lateinit var dataBinding: CryptoFragmentBinding

    companion object {
        fun newInstance() = CryptoScreenFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel =
            ViewModelProvider(this, CryptoModelFactory(App.repositories.CryptoScreen())).get(
                CryptoScreenViewModel::class.java
            )
        dataBinding = CryptoFragmentBinding.inflate(inflater, container, false)
        dataBinding.buttonShow.setOnClickListener {
            viewModel.getFakeData()
        }
        return dataBinding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataBinding.lifecycleOwner = viewLifecycleOwner
        //  dataBinding.viewModel = viewModel
        dataBinding.cryptoRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        val cryptoObserver = Observer<List<CryptoModel>> {
            dataBinding.cryptoRecyclerView.adapter = CryptoAdapter(it)
        }
        dataBinding.cryptoRecyclerView.adapter?.notifyDataSetChanged()
        viewModel.listCrypto.observe(viewLifecycleOwner, cryptoObserver)


    }

}