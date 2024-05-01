package id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.persistences.AppDatabase
import id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.persistences.TodoDao
import javax.inject.Singleton

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 9 = Offline First Application
// 26 April 2024

@Module
@InstallIn(SingletonComponent::class)
object PersistenceModule {
    @Provides
    @Singleton
    fun provideDatabase(application: Application) : AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, AppDatabase.DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideTodoDao(appDatabase: AppDatabase) : TodoDao {
        return appDatabase.todoDao()
    }
}