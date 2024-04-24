import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
@Preview

fun ejercicio6() {

    // Columna principal.
    Column(
        modifier = Modifier
            //.fillMaxWidth()
            //.fillMaxHeight()
            .padding(top = 0.dp, bottom = 0.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Primera Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            // Box1
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(Color.Cyan)
            ) {
                Text(
                    text = " Ejercicio 2 ",
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .border(2.dp, Color.Black)
                        .align(Alignment.TopCenter),
                    style = TextStyle(
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold,
                        background = Color.Yellow,
                    )
                )
            } // Fin BOX1
        }

        // Segunda Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            // Box2
            Box(
                modifier = Modifier
                    .background(Color.Blue)
            ) {
                Text(
                    text = "PMDM",
                    style = TextStyle(
                        color = Color.White
                    ),
                    modifier = Modifier.align(Alignment.BottomCenter)
                )
            } // Fin Box2

            // Box3
            Box(
                modifier = Modifier
                    .background(Color.Green)
            ) {
                Text(
                    text = "DAM 2",
                    style = TextStyle(
                        color = Color.Black
                    ),
                    modifier = Modifier.align(Alignment.Center)
                )
            } // Fin Box3
        }

        // Tercer Row
        Row(

        ) {
            // Box 4
            Box(

            ) {

            } // Fin Box4
        }

    } // Fin Columna.

}