package dagger.module

import com.example.testtaskcript.ui.main.CryptoScreenRepository
import com.example.testtaskcript.ui.main.CryptoScreenRepositoryImplementation
import dagger.Module
import dagger.Provides
import model.AppDataBase

@Module
class CryptoModule {

@Provides
fun CryptoList(
    dao: AppDataBase
): CryptoScreenRepository = CryptoScreenRepositoryImplementation(
    daoCrypto = dao.getDaoCrypto())
}