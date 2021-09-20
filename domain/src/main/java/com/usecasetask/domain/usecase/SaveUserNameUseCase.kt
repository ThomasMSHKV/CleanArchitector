package com.usecasetask.domain.usecase

import com.usecasetask.domain.model.SaveUserNameParam
import com.usecasetask.domain.model.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(param: SaveUserNameParam): Boolean {

        val oldUserName = userRepository.getName()

        if (oldUserName.firstName == param.name){
            return true
        }

        val result: Boolean = userRepository.saveName(saveParam = param)
        return result
    }
}