package com.example.usecasetask.domain.usecase

import com.example.usecasetask.domain.model.UserName
import com.example.usecasetask.domain.model.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute() : UserName {
        return userRepository.getName()

    }
}