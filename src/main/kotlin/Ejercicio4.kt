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

@Composable
@Preview

fun Ejercicio4() {
    // Cajas en lína horizontal.
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 32.dp),
        verticalAlignment = Arrangement.Bottom,
        horizontalArrangement = Arrangement.SpaceEvenly

    ) {
        // Rectángulo1
        Box(
            modifier = Modifier
                .height(500.dp)
                .width(75.dp)
                .border(BorderStroke(2.dp, Color.Red), shape = RectangleShape)
                .align(Alignment.Bottom)
        ) {
            Text(
                text = "Ejemplo 1",
                modifier = Modifier.align(Alignment.TopCenter)
            )
        }
        // Rectángulo 2
        Box(
            modifier = Modifier
                .height(400.dp)
                .width(75.dp)
                .border(BorderStroke(2.dp, Color.Blue), shape = RectangleShape)
                .align(Alignment.Bottom)
        ) {
            Text(
                text = "Ejemplo 2",
                modifier = Modifier.align(Alignment.TopCenter)
            )
        }
        // Rectángulo 3
        Box(
            modifier = Modifier
                .height(300.dp)
                .width(75.dp)
                .border(BorderStroke(2.dp, Color.Red), shape = RectangleShape)
                .align(Alignment.Bottom)
        ) {
            Text(
                text = "Ejemplo 3",
                modifier = Modifier.align(Alignment.TopCenter)
            )
        }
        // Rentángulo 4
        Box(
            modifier = Modifier
                .height(200.dp)
                .width(75.dp)
                .border(BorderStroke(2.dp, Color.Blue), shape = RectangleShape)
                .align(Alignment.Bottom)
        ) {
            Text(
                text = "Ejemplo 4",
                modifier = Modifier.align(Alignment.TopCenter)
            )
        }
    }
}