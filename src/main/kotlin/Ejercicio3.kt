import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.unit.dp

@Composable
@Preview

fun Ejercicio3() {
    // Cuatro rectangulos, centrados en la vertical en columna.

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