package user

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import theme.Theme

enum class Permission(val canSeeControlPanel: Boolean = false) {
    USER,
    EDITOR(
        canSeeControlPanel = true
    ),
    ADMIN(
        canSeeControlPanel = true
    ),
    SECRET(
        canSeeControlPanel = true
    )
}