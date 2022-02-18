package common

import android.app.Application
import androidx.room.Room
import dagger.module.CryptoComponent
import dagger.module.CryptoModule
import dagger.module.DaggerCryptoComponent
import model.AppDataBase

class App: Application() {

    private var database: AppDataBase? = null
    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this, AppDataBase::class.java, "database")
            .fallbackToDestructiveMigration()
            .build()
        repositories = DaggerCryptoComponent
            .builder()
            .appDataBase(database)
            .cryptoModule(CryptoModule())
            .build()


    }

    companion object {
        lateinit var repositories: CryptoComponent
            private set

    }
}