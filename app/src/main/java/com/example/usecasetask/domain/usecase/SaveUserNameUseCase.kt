package com.example.usecasetask.domain.usecase

import com.example.usecasetask.data.repository.UserRepositoryImpl
import com.example.usecasetask.domain.model.SaveUserNameParam
import com.example.usecasetask.domain.model.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(param: SaveUserNameParam): Boolean {
        val result: Boolean = userRepository.saveName(saveParam = param)
        return result
    }
}