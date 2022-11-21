package utils

import user.Permission
import user.User
import users
import java.util.UUID

object UserHelper {
    fun getUser(username: String): User? {
        return users[username]
    }

    fun createUser(uuid: UUID, username: String, password: String, permission: Permission):User {
        val user = User(uuid, username, password, permission)
        users[username] = user
        return user
    }
}