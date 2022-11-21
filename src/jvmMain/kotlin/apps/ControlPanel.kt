package apps

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ApplicationScope

@Composable
fun ApplicationScope.panel() {
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
                IconButton(
                    modifier = Modifier
                        .rotate(45f)
                        .padding(bottom = 1.dp),

                    onClick = { exitApplication() },
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "close",
                        tint = Color.White,
                        modifier = Modifier
                            .scale(1.3f)
                    )
                }
            }
        }
    }

    Row {
        // arrow left
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            IconButton(
                modifier = Modifier
                    .rotate(45f)
                    .padding(bottom = 1.dp),

                onClick = { exitApplication() },
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "pervier",
                    tint = MaterialTheme.colors.primary,
                    modifier = Modifier
                        .scale(1.3f)
                )
            }
        }

        //content
        Box(modifier = Modifier
            .weight(12f)
            .fillMaxSize()
        ) {}

        // arrow right
        Box(modifier = Modifier
           .weight(1f)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            IconButton(
                modifier = Modifier
                    .rotate(45f)
                    .padding(bottom = 1.dp),

                onClick = { exitApplication() },
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "next",
                    tint = MaterialTheme.colors.primary,
                    modifier = Modifier
                        .scale(2.3f)
                )
            }
        }
    }
}