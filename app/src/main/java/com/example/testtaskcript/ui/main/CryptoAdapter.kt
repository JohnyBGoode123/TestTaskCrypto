package com.example.testtaskcript.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testtaskcript.databinding.RecyclerviewCryptoJsonBinding
import model.dbModels.CryptoModel

class CryptoAdapter(
    private var listCrypto: List<CryptoModel>,
): RecyclerView.Adapter<CryptoAdapter.CryptoHolder>() {

    class CryptoHolder(val cryptoBinding: RecyclerviewCryptoJsonBinding) :
        RecyclerView.ViewHolder(cryptoBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoHolder {
        val cryptoScreenBinding = RecyclerviewCryptoJsonBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CryptoHolder(cryptoScreenBinding)
    }
    override fun onBindViewHolder(holder: CryptoHolder, position: Int) {
        holder.cryptoBinding.itemizeList = listCrypto[position]
    }

    override fun getItemCount(): Int {
       return listCrypto.size
    }

}