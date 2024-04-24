import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState


/**
 * TODO :
 * --CORRECCIONES A HACER--
 * Ejercicio1 > Cambiar código, se hace sólo con Box.                               -->
 * Ejercicio2 >
 * Ejercicio3 > No hace falta hacer todas las Box, simplemente texto y color.       -->
 * Ejercicio4 > Puede eliminarse la columna principal y dejar Row anclado al fondo. -->
 * Ejercicio5 >
 * Ejercicio6 > Podría hacerse con Columna> Box+Text / Row+2Box / Box+Text
 *                  - Relleno de la caja de texto arreglado.
 * Ejercicio7 > Terminar para incluir la función que pide: MySpacer()
 */
fun main() = application {
    val windowsState = rememberWindowState(size = DpSize(800.dp, 1200.dp))

    Window(
        onCloseRequest = ::exitApplication,
        title = "Ejemplo para practicar",
        state = windowsState
    ){
        ejercicio6()
    }
}
/*
{
        //ejercicio1()
        //ejercicio2()
        //ejercicio3()
        //ejercicio4()
        //ejercicio5()
        //ejercicio6()
        //ejercicio7()
    }
 */