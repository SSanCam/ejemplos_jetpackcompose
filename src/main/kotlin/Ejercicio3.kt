import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val windowsState = rememberWindowState(size = DpSize(800.dp, 1200.dp))

    Window(
        onCloseRequest = ::exitApplication, title = "My Column", state = windowsState
    ) {
        ejercicio3()
    }
}

// SÓLO USANDO COLUMNA Y TEXT
@Composable
fun ejercicio3() {
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            "Ejemplo 1",
            modifier = Modifier
                .background(Color.Red)
                .padding(16.dp)
                .weight(2f)
        )
        Text(
            "Ejemplo 2",
            modifier = Modifier
                .background(Color.LightGray)
                .padding(16.dp)
                .weight(3f)
        )
        Text(
            "Ejemplo 3",
            modifier = Modifier
                .background(Color.Cyan)
                .padding(16.dp)
                .height(400.dp)
                .weight(3f)
        )
        Text(
            "Ejemplo 4",
            modifier = Modifier
                .background(Color.Green)
                .padding(16.dp)
                .height(200.dp)
                .weight(2f)
        )
    }
}

/* FORMA CON CAJAS
@Composable
@Preview
fun ejercicio3() {
// No hace falta hacer todas las Box, simplemente texto y color.
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally    ) {
        // Primera caja
        Box(
            modifier = Modifier
                .width(75.dp)
                .height(150.dp)
                .background(Color.Red)
        ) {
            Text(
                text = "Ejemplo 1",
                color = Color.Black,
                modifier = Modifier.align(Alignment.TopCenter)
            )
        }
        // Segunda caja
        Box(
            modifier = Modifier
                .width(75.dp)
                .height(250.dp)
                .background(Color.LightGray)
        ) {
            Text(
                text = "Ejemplo 2",
                modifier = Modifier.align(Alignment.TopCenter)
            )
        }
        // Tercera caja.
        Box(
            modifier = Modifier
                .width(75.dp)
                .height(250.dp)
                .background(Color.Cyan)
        ){
            Text(
                text = "Ejemplo 3",
                modifier = Modifier.align(Alignment.TopCenter)
            )
        }
        //Cuarta caja.
        Box(
            modifier = Modifier
                .width(75.dp)
                .height(150.dp)
                .background(Color.Green)
        ){
            Text(
                text = "Ejemplo 4",
                modifier = Modifier.align(Alignment.TopCenter)
            )
        }
    }

}
*/