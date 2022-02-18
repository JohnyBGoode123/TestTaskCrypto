package com.example.testtaskcript.ui.main

import model.DaoCrypto

class CryptoScreenRepositoryImplementation(private val daoCrypto: DaoCrypto):CryptoScreenRepository {
    override suspend fun getAllFromCoinGecko() = daoCrypto.getAllFromCoinGecko()

    override suspend fun insertCoinGecko(coinGecko: MutableCollection<DaoCrypto.CoinGecko>) {
        daoCrypto.insertCoinGecko(coinGecko)
    }

}