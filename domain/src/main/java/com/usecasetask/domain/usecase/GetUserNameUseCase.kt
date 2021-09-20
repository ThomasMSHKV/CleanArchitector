package com.usecasetask.domain.usecase

import com.usecasetask.domain.model.UserName
import com.usecasetask.domain.model.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute() : UserName {
        return userRepository.getName()

    }
}