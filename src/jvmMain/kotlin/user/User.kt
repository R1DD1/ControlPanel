package user

import java.util.UUID

class User (
    val uuid: UUID,
    val username: String,
    val password: String,
    val permission: Permission
        )