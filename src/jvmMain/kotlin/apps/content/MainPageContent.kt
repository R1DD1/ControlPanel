package apps.content

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import elements.Content
import theme.Theme


val list = listOf(News(), NewYear(), Dings())

class News: Content {
    @Composable
    override fun create() {
        Box(modifier = androidx.compose.ui.Modifier
            .clip(shape = RoundedCornerShape(15))
            .background(Theme.secondary())
            .height(600.dp)
            .width(1050.dp)
        ) {
            Text(text = "")
        }
    }
}

class NewYear: Content {
    @Composable
    override fun create() {
        Box(modifier = androidx.compose.ui.Modifier
            .clip(shape = RoundedCornerShape(15))
            .background(Theme.secondary())
            .height(600.dp)
            .width(1050.dp)
        ) {
            Text(text = "")
        }
    }
}

class Dings: Content {
    @Composable
    override fun create() {
        Box(modifier = androidx.compose.ui.Modifier
            .clip(shape = RoundedCornerShape(15))
            .background(Theme.secondary())
            .height(600.dp)
            .width(1050.dp)
        ) {
            Text(text = "")
        }
    }
}