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
import androidx.compose.ui.unit.sp


@Composable
@Preview

fun ejercicio6() {

    // Columna principal.
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 0.dp, bottom = 0.dp),
        //verticalArrangement = Arrangement.SpaceEvenly
    ) {
        // Primera Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            // Box1
            Box(
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth()
                    .background(Color.Cyan)
            ) {
                Text(
                    text = "Ejercicio 2",
                    modifier = Modifier
                        .padding(10.dp)
                        .border(2.dp, Color.Black)
                        .align(Alignment.TopCenter),
                    style = TextStyle(
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold,
                        background = Color.Yellow,
                        fontSize = 30.sp
                    )
                )
            }
        }

        // Segunda Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            // Box2
            Box(
                modifier = Modifier
                    .height(300.dp)
                    .weight(1f)
                    .background(Color.Blue)
            ) {
                Text(
                    text = "PMDM",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 30.sp
                    ),
                    modifier = Modifier.align(Alignment.BottomCenter)
                )
            }

            // Box3
            Box(
                modifier = Modifier
                    .height(300.dp)
                    .weight(1f)
                    .background(Color.Green)
            ) {
                Text(
                    text = "DAM 2",
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 30.sp
                    ),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }

        // Tercer Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            // Box 4
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .background(Color.Magenta)
            ) {
                Text(
                    text = "...Combinando Column y Box",
                    style = TextStyle(
                        color = Color.Yellow,
                        fontSize = 22.sp
                    ),
                    modifier = Modifier.align(Alignment.BottomEnd)
                )
            }
        }

    } // Fin Columna.

}