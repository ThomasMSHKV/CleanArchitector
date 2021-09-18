package com.example.usecasetask.data.repository

import android.content.Context
import android.content.SharedPreferences
import com.example.usecasetask.data.storage.UserStorage
import com.example.usecasetask.domain.model.SaveUserNameParam
import com.example.usecasetask.domain.model.UserName
import com.example.usecasetask.domain.model.repository.UserRepository
import java.security.AccessControlContext


class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {


    override fun saveName(saveParam: SaveUserNameParam): Boolean {
        val rezult = userStorage.save(saveParam)
        return rezult
    }

    override fun getName(): UserName {
        val user = userStorage.get()
        return user

    }
}