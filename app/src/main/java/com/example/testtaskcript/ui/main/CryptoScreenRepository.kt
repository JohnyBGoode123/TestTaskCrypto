package com.example.testtaskcript.ui.main

import model.DaoCrypto

interface CryptoScreenRepository {

    suspend fun getAllFromCoinGecko(): List<DaoCrypto.CoinGecko>

    suspend fun insertCoinGecko(coinGecko: MutableCollection<DaoCrypto.CoinGecko>)
}