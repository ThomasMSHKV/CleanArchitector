package com.example.usecasetask.domain.model.repository

import com.example.usecasetask.domain.model.SaveUserNameParam
import com.example.usecasetask.domain.model.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName
}