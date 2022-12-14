import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import user.User
import androidx.compose.ui.window.*
import apps.auth
import client.Client
import elements.toolBar
import elements.userBar
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
        resizable = false,
    ) {
        toolBar()
        auth()
    }
}

