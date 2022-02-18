package common

import model.DaoCrypto
import model.dbModels.CryptoModel

object Constants {
    val fakeData: List<CryptoModel> = listOf(DaoCrypto.CoinGecko("abc", 3.9))
}