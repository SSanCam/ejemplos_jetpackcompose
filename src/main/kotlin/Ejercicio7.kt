import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

/**
 * Crear una función y utilizarla en el código del ejemplo 4 para sustituir el código directo
 * de Spacer() por una función a la que le pasaremos un parámetro indicando la altura
 * del espacio que queremos en cada llamada.
 */


@Composable
@Preview

fun separacion(){

}
fun ejercicio7() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Bottom
        ) {
            // Rectángulo1
            Box(
                modifier = Modifier
                    .height(500.dp)
                    .width(75.dp)
                    .border(BorderStroke(2.dp, Color.Red), shape = RectangleShape)
            ) {
                Text(
                    text = "Ejemplo 1",
                    modifier = Modifier.align(Alignment.TopCenter)
                )
            }
            // Rectángulo 2
            Box(
                modifier = Modifier
                    .height(350.dp)
                    .width(75.dp)
                    .border(BorderStroke(2.dp, Color.Blue), shape = RectangleShape)
            ) {
                Text(
                    text = "Ejemplo 2",
                    modifier = Modifier.align(Alignment.TopCenter)
                )
            }
            // Rectángulo 3
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .width(75.dp)
                    .border(BorderStroke(2.dp, Color.Red), shape = RectangleShape)
            ) {
                Text(
                    text = "Ejemplo 3",
                    modifier = Modifier.align(Alignment.TopCenter)
                )
            }
            // Rentángulo 4
            Box(
                modifier = Modifier
                    .height(50.dp)
                    .width(75.dp)
                    .border(BorderStroke(2.dp, Color.Blue), shape = RectangleShape)
            ) {
                Text(
                    text = "Ejemplo 4",
                    modifier = Modifier.align(Alignment.TopCenter)
                )
            }
        }
    }

}