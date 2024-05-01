package id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 9 = Offline First Application
// 26 April 2024

@Composable
fun TodoScreen() {

    Column(modifier = Modifier.padding(10.dp).fillMaxWidth()) {
        FormTodoScreen()
        ListTodoScreen()
    }
}