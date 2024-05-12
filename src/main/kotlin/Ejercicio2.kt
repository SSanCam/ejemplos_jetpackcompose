import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val windowsState = rememberWindowState(size = DpSize(800.dp, 1200.dp))

    Window(
        onCloseRequest = ::exitApplication,
        title = "MyBox",
        state = windowsState
    ){
        ejercicio2()
    }
}


@Composable
@Preview
fun ejercicio2() {

    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .width(300.dp)
                    .height(200.dp)
                    .background(Color.Cyan),
            ){
                Text(
                    text = "Ésto es un EJEMPLO del uso de box",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 5.dp)
                )
            }
        }
    }
}

