package utils

import elements.Content

object ContentHelper {
    fun slideContent(currentIndex: Int, list: List<Content> ): Content {
        if (currentIndex + 1 <= list.size) {
            return list[currentIndex + 1]
        }
        return list.first()
    }
}