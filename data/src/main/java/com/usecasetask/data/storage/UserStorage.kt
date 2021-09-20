package com.usecasetask.data.storage

import com.usecasetask.data.storage.model.User

interface UserStorage {

    fun save(user: User): Boolean

    fun get(): User
}