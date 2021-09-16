package com.example.usecasetask.domain.usecase

import com.example.usecasetask.domain.model.UserName

class GetUserNameUseCase {

    fun execute() : UserName {
        return UserName(firstName = "Amin", lastName = "Mereshkov")
    }
}