package model


import androidx.room.*
import model.dbModels.CryptoModel

@Dao
abstract class DaoCrypto {
    @Query("SELECT * FROM CoinGecko")
    abstract suspend fun getAllFromCoinGecko(): List<CoinGecko>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insertCoinGecko(coinGecko: MutableCollection<CoinGecko>)

    @Entity
    data class CoinGecko(
        @PrimaryKey
        override val id: String,
        override val value: Double
    ): CryptoModel

}