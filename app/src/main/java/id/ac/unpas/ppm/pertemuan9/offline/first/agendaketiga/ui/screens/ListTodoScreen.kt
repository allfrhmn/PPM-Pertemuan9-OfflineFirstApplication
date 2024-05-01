package id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.hilt.navigation.compose.hiltViewModel
import id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.models.Todo
import kotlinx.coroutines.launch

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 9 = Offline First Application
// 26 April 2024

@Composable
fun ListTodoScreen() {

    val scope = rememberCoroutineScope()
    val viewModel = hiltViewModel<TodoViewModel>()

    val list: List<Todo> by viewModel.todos.observeAsState(listOf())
    val title = remember { mutableStateOf("TODO") }

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = title.value, modifier = Modifier.fillMaxWidth())
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(list.size) { index ->
                val item = list[index]
                TodoItem(item = item) {
                    scope.launch {
                        viewModel.delete(it)
                    }
                }
            }
        }
    }

    viewModel.isLoading.observe(LocalLifecycleOwner.current) {
        if (it) {
            title.value = "Loading..."
        } else {
            title.value = "TODO"
        }
    }
}