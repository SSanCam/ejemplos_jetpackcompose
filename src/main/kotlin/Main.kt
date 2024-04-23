
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val windowsState = rememberWindowState(size = DpSize(1200.dp, 800.dp))

    Window(
        onCloseRequest = ::exitApplication,
        title = "Ejemplo para practicar",
        state = windowsState
    ) {

        //Ejercicio1()
        Ejercicio2()
        //Ejercicio3()
        //Ejercicio4()
        //Ejercicio5()
        //Ejercicio6()
        //Ejercicio7()

        Ejercicio1()
        Ejercicio2()
    }

}
