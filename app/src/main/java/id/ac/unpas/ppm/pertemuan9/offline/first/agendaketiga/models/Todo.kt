package id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.models

import androidx.compose.runtime.Immutable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 9 = Offline First Application
// 26 April 2024

@Entity
@Immutable
data class Todo(
    @PrimaryKey
    val id: String,
    val title: String,
    val description: String,
    @SerializedName("due_date")
    val dueDate: String
)