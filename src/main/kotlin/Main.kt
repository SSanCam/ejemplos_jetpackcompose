
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {

    // Es una interface con una serie de métodos.
    val windowsState = rememberWindowState(size = DpSize(1200.dp, 800.dp))

    // Ésta línea será siempre igual, básico para nuestro programa.
    Window(
        onCloseRequest = ::exitApplication,
        title = "Ejemplo para practicar",
        state = windowsState
    ) {
        // Llamamos a la función de antes

        Ejercicio1()
        Ejercicio2()
    }

}
