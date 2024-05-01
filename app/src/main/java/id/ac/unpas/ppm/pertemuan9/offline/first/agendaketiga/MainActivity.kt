package id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.ui.screens.TodoScreen
import id.ac.unpas.ppm.pertemuan9.offline.first.agendaketiga.ui.theme.AgendaKetigaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AgendaKetigaTheme {
                // A surface container using the 'background' color from the theme
                TodoScreen()
            }
        }
    }
}