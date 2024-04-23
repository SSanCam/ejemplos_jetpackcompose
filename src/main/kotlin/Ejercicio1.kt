import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment.Horizontal
import androidx.compose.ui.Alignment.Vertical

@Composable

fun Ejercicio1() {
    // Uso único Box
    Box(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize()

    )
    Box(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .background(Color.Blue)
            //.align(Alignment.Center)
    )
}