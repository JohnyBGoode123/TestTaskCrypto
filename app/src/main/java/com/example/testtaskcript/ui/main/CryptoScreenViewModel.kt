package com.example.testtaskcript.ui.main

import androidx.lifecycle.*
import common.Constants
import dagger.module.CryptoComponent
import kotlinx.coroutines.launch
import model.DaoCrypto
import model.dbModels.CryptoModel

class CryptoScreenViewModel(
    private val repository: CryptoScreenRepository
) : ViewModel() {

    private var _listCrypto: List<CryptoModel>? = null
    set(value) {
        field = value
        (listCrypto as MutableLiveData).postValue(value)
    }
    val listCrypto: LiveData<List<CryptoModel>> = MutableLiveData()
    fun getDataCrypto()
    {
        viewModelScope.launch {
            val listCrypto: List<CryptoModel>? = try {
                repository.getAllFromCoinGecko()
            }
            catch (t: Throwable){
                print(t.message)
                null
            }
            listCrypto.let { _listCrypto = it }
        }
    }
    fun getFakeData()
    {
        _listCrypto = Constants.fakeData
    }




}