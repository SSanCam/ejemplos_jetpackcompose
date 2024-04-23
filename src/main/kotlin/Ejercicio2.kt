import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


class Ejercicio2 {
    @Composable

    fun Ejercicio2() {
        // Uso único Box
        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxSize()
        )

        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .width(150.dp)
                .height(50.dp)
        ){
            Text("Esto es un EJEMPLO del uso de BOX.")

        }
    }
}