import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val windowsState = rememberWindowState(size = DpSize(800.dp, 1200.dp))

    Window(
        onCloseRequest = ::exitApplication,
        title = "Ejemplo para practicar",
        state = windowsState
    ) {
        //ejercicio1()
        //ejercicio2()
        //ejercicio3()
        //ejercicio4()
        //ejercicio5()
        //ejercicio6()
        //ejercicio7()
    }
}
