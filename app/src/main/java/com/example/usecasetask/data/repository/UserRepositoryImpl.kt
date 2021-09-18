package com.example.usecasetask.data.repository

import com.example.usecasetask.data.storage.model.User
import com.example.usecasetask.data.storage.UserStorage
import com.example.usecasetask.domain.model.SaveUserNameParam
import com.example.usecasetask.domain.model.UserName
import com.example.usecasetask.domain.model.repository.UserRepository


class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {


    override fun saveName(saveParam: SaveUserNameParam): Boolean {
        val user = mapToStorage(saveParam )

        val rezult = userStorage.save(user)
        return rezult
    }

    override fun getName(): UserName {
        val user = userStorage.get()

        return mapToDomain(user)

    }

    private fun mapToStorage(saveParam: SaveUserNameParam): User {
        return User(firstName = saveParam.name, lastName = "")
    }

    private fun mapToDomain(user: User): UserName {
        return UserName(firstName = user.firstName, lastName = user.lastName)
    }
}