package com.example.usecasetask.data.repository

import com.example.usecasetask.domain.model.SaveUserNameParam
import com.example.usecasetask.domain.model.UserName
import com.example.usecasetask.domain.model.repository.UserRepository

class UserRepositoryImpl:UserRepository {

    override fun saveName(saveParam: SaveUserNameParam): Boolean{
        return true
    }

    override fun getName(): UserName {

        return UserName(firstName = "Amin", lastName = "Mereshkov")

    }
}