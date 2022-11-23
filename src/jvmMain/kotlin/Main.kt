import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import user.User
import androidx.compose.ui.window.*
import apps.auth
import elements.Timer
import elements.toolBar
import user.Permission
import utils.UserHelper

import java.util.*

val users = mutableMapOf<String, User>()

fun main() = application {
    var authSuccess by remember { mutableStateOf(false) }
    UserHelper.createUser(UUID.randomUUID(), "moteloff", "123", Permission.SECRET)
    Window(
        state = rememberWindowState(placement = WindowPlacement.Maximized, position = WindowPosition(Alignment.Center)),
        onCloseRequest = { exitApplication() },
        title = "Прототип",
        undecorated = true,
        resizable = true,
    ) {
        toolBar()
        auth()
    }
}

