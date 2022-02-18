package model


import androidx.room.*

@Dao
abstract class DaoCrypto {
    @Query("SELECT * FROM CoinGecko")
    abstract suspend fun getAllFromCoinGecko(): List<CoinGecko>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insertCoinGecko(coinGecko: MutableCollection<CoinGecko>)

    @Entity
    data class CoinGecko(
        @PrimaryKey
         val id: String,
         val value: Double
    )

}