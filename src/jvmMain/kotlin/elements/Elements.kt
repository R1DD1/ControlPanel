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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ApplicationScope
import theme.Theme

@Composable
@OptIn(ExperimentalMaterialApi::class)
fun ApplicationScope.toolBar() {
    //toolbar
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(20.dp)
            .background(Theme.primary())
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()

        ) {

            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.End) {
                Card(
                    modifier = Modifier.size(20.dp).padding(5.dp),
                    onClick = { exitApplication() }
                ) {
                    Image(
                        painter = painterResource("close.png"),
                        alignment = Alignment.Center,
                        contentDescription = "close",
                        modifier = Modifier
                            .background(Theme.primary())
                            .rotate(180f),
                        contentScale = ContentScale.FillBounds
                    )
                }
            }
        }
    }
}

@Composable
fun ApplicationScope.userBar() {
    //userbar
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Theme.secondary())
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.End) {
               Card (
                   modifier = Modifier.size(100.dp).fillMaxHeight().padding(10.dp),
                       ) {
                   Image(
                       painter = painterResource("userprofile.png"),
                       alignment = Alignment.Center,
                       contentDescription = "userProfile",
                       modifier = Modifier.background(Color(0f,0f,0f, .0f)),
                   )
               }
            }
        }
    }
}



