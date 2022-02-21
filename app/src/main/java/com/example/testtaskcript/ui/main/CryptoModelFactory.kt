package com.example.testtaskcript.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import common.App

class CryptoModelFactory(private val repository: CryptoScreenRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CryptoScreenViewModel(repository) as T
    }

}