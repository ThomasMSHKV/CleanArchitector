package com.usecasetask.domain.model.repository

import com.usecasetask.domain.model.SaveUserNameParam
import com.usecasetask.domain.model.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName
}