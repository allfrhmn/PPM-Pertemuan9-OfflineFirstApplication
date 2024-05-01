package id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.networks.responses

import id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.models.Todo

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 9 = Offline First Application
// 26 April 2024

data class TodoPostResponse(
    val message: String,
    val success: Boolean,
    val data: Todo?
)
