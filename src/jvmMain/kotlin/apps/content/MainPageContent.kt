package apps.content

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import elements.Content
import theme.Theme


val list = listOf(News(), NewYear(), Dings())

class News: Content {
    @Composable
    override fun create() {
        Box(modifier = androidx.compose.ui.Modifier
            .clip(shape = RoundedCornerShape(15))
            .background(Theme.secondary())
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "КОНТЕНТ 1", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 32.sp)
        }
    }
}

class NewYear: Content {
    @Composable
    override fun create() {
        Box(modifier = androidx.compose.ui.Modifier
            .clip(shape = RoundedCornerShape(15))
            .background(Theme.secondary())
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        )  {
            Text(text = "КОНТЕНТ 2", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 32.sp)
        }
    }
}

class Dings: Content {
    @Composable
    override fun create() {
        Box(modifier = androidx.compose.ui.Modifier
            .clip(shape = RoundedCornerShape(15))
            .background(Theme.secondary())
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        )  {
            Text(text = "КОНТЕНТ 3", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 32.sp)        }
    }
}