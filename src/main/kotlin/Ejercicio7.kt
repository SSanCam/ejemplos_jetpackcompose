import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

/**
 * Crear una función y utilizarla en el código del ejemplo 4 para sustituir el código directo
 * de Spacer() por una función a la que le pasaremos un parámetro indicando la altura
 * del espacio que queremos en cada llamada.
 */

fun main() = application {
    val windowsState = rememberWindowState(size = DpSize(400.dp, 600.dp))

    Window(
        onCloseRequest = ::exitApplication,
        title = "CustomSpacer",
        state = windowsState
    ) {
        ejercicio7()
    }
}

@Composable
@Preview

fun ejercicio7() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 0.dp, bottom = 0.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        // BOX 1
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Cyan)
        ) {
            Text(
                text = "BOX1",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.Black
                ),
                modifier = Modifier.align(Alignment.Center)
            )
        }
        CustomSpacer(50.dp)
        // BOX 2
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.LightGray)
        ) {
            Text(
                text = "BOX2",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.Black
                ),
                modifier = Modifier.align(Alignment.Center)
            )
        }
        CustomSpacer(100.dp)
        //BOX 3
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Green)
        ) {
            Text(
                text = "BOX3",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.Black
                ),
                modifier = Modifier.align(Alignment.Center)
            )
        }
        CustomSpacer(25.dp)
        // BOX 4
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Magenta)
        ) {
            Text(
                text = "BOX4",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.Black
                ),
                modifier = Modifier.align(Alignment.Center)
            )
        }
    } // Fin columna
}

@Composable
fun CustomSpacer(height: Dp) {
    Spacer(modifier = Modifier.height(height))
}