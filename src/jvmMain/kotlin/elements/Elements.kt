package elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.ContentAlpha
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ApplicationScope

@Composable
@OptIn(ExperimentalMaterialApi::class)
fun ApplicationScope.toolBar() {
    //toolbar
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(20.dp)
            .background(MaterialTheme.colors.primary.copy(alpha = ContentAlpha.high))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()

        ) {

            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.End) {
                Card(
                    modifier = Modifier.size(20.dp).padding(5.dp),
                    elevation = 2.dp,
                    onClick = { exitApplication() }
                ) {
                    Image(
                        painter = painterResource("close.png"),
                        alignment = Alignment.Center,
                        contentDescription = "close",
                        modifier = Modifier
                            .background(MaterialTheme.colors.primary)
                            .rotate(180f),
                        contentScale = ContentScale.FillBounds
                    )
                }
            }
        }
    }
}



