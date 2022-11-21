package utils

import users

object Auth {
    fun auth(username: String, password: String): Boolean {
        users.forEach { (name, user) ->
            if (name == username) { if (user.password == password) { return true } } }
        return false
    }
}