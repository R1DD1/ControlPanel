package apps

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ApplicationScope

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ApplicationScope.panel() {
    Row {
        // arrow left
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = Modifier.size(62.dp).rotate(180f),
                shape = CircleShape,
                elevation = 2.dp
            ) {
                Image(
                    painter = painterResource("arrow.png"),
                    alignment = Alignment.Center,
                    contentDescription = "arrowLeft",
                    modifier = Modifier
                        .background(MaterialTheme.colors.primary),
                    contentScale = ContentScale.FillBounds
                )
            }
        }

        //content
        Box(modifier = Modifier
            .weight(12f)
            .fillMaxSize()
        ) {

        }

        // arrow right
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = Modifier.size(62.dp),
                shape = CircleShape,
                elevation = 2.dp
            ) {
                Image(
                    painter = painterResource("arrow.png"),
                    alignment = Alignment.Center,
                    contentDescription = "arrowLeft",
                    modifier = Modifier
                        .background(MaterialTheme.colors.primary),
                    contentScale = ContentScale.FillBounds
                )
            }
        }
    }
}