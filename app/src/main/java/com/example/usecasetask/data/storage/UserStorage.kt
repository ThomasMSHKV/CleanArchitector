package com.example.usecasetask.data.storage

import com.example.usecasetask.domain.model.SaveUserNameParam
import com.example.usecasetask.domain.model.UserName

interface UserStorage {

    fun save(saveParam: SaveUserNameParam): Boolean

    fun get(): UserName
}