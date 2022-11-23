package apps.content

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import elements.Content


val list = listOf(News(), NewYear(), Dings())

class News: Content {
    @Composable
    override fun create() {
        Box(modifier = androidx.compose.ui.Modifier
            .background(Color.Yellow)) {
            Text(text = "NEWS")
        }
    }
}

class NewYear: Content {
    @Composable
    override fun create() {
        Box(modifier = androidx.compose.ui.Modifier
            .background(Color.Red)) {
            Text(text = "NewYear")
        }
    }
}

class Dings: Content {
    @Composable
    override fun create() {
        Box(modifier = androidx.compose.ui.Modifier
            .background(Color.Blue)) {
            Text(text = "DINGs")
        }
    }
}