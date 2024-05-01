package id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.ui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.models.Todo

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 9 = Offline First Application
// 26 April 2024

@Composable
fun TodoItem(item: Todo, onDeleteClick: (String) -> Unit) {
    Row {
        Text(modifier = Modifier.weight(3f), text = item.title)
        Text(modifier = Modifier.weight(3f), text = item.description)
        Text(modifier = Modifier.weight(3f), text = item.dueDate)
        Button(modifier = Modifier.weight(3f), onClick = { onDeleteClick(item.id) }) {
            Text(text = "Delete")
        }
    }
}