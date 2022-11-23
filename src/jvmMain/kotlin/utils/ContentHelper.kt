package utils

import apps.content.list
import elements.Content

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
}