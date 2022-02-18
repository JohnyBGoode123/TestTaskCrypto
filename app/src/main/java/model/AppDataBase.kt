package model


import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        DaoCrypto.CoinGecko::class
    ],
    version = 2
)

abstract class AppDataBase: RoomDatabase() {
    abstract fun getDaoCrypto(): DaoCrypto
}