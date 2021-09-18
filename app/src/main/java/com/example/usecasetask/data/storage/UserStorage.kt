package com.example.usecasetask.data.storage

import com.example.usecasetask.data.storage.model.User

interface UserStorage {

    fun save(user: User): Boolean

    fun get(): User
}