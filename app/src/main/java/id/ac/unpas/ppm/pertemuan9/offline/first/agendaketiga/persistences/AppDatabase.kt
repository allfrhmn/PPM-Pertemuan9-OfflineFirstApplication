package id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.models.Todo

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 9 = Offline First Application
// 26 April 2024

@Database(entities = [Todo::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun todoDao(): TodoDao

    companion object {
        const val DATABASE_NAME = "agenda-database"
    }
}