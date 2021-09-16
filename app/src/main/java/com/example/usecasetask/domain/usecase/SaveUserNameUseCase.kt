package com.example.usecasetask.domain.usecase

import com.example.usecasetask.domain.model.SaveUserNameParam

class SaveUserNameUseCase {

    fun execute(param: SaveUserNameParam): Boolean {
        if (param.name.isEmpty()){
            return false

        }else
            return true

    }
}