package utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import apps.content.list
import theme.Theme

object ContentHelper {
    fun slideContent(currentIndex: Int): Int {
        if (currentIndex + 1 <= list.size - 1) {
            return currentIndex + 1
        }
        return 0
    }

    fun next(currentIndex: Int): Int {
        if (currentIndex + 1 <= list.size - 1) {
            return currentIndex + 1
        }
        return 0
    }

    fun previous(currentIndex: Int): Int {
        if (currentIndex - 1 >= 0) {
            return currentIndex - 1
        }
        return list.size - 1
    }

    fun autoNext(currentIndex: Int): Int {
        if (currentIndex == list.size-1) {
            return 0
        }
        return currentIndex + 1
    }

    @Composable
    fun showCurrentContent (currentIndex: Int) {
        var elem = 0
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Row (horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                for (item in list.indices) {
                    if (elem == currentIndex) { circle(true) } else { circle() }
                    elem++
                }
            }
        }
    }

    @Composable
    private fun circle(isActive: Boolean = false) {
        var color = Color(.1f, .1f, .1f, .3f)
        var size = 10.dp
        if (isActive) {
            color = Theme.primary()
            size = 10.5.dp
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(size)
                .clip(shape = CircleShape)
                .background(color)
                .fillMaxSize()
        ) {

        }
    }
}