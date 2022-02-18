package dagger.module

import com.example.testtaskcript.ui.main.CryptoScreenRepository
import dagger.Component
import model.AppDataBase

@Component(
    dependencies = [AppDataBase::class],
    modules = [CryptoModule::class]
)
interface CryptoComponent {

    abstract fun CryptoScreen(): CryptoScreenRepository
}