package id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.networks.TodoApi
import id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.persistences.TodoDao
import id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.repositories.TodoRepository

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 9 = Offline First Application
// 26 April 2024

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    @ViewModelScoped
    fun provideTodoRepository(todoDao: TodoDao, todoApi: TodoApi): TodoRepository {
        return TodoRepository(todoApi, todoDao)
    }
}