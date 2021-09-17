package com.example.usecasetask.data.repository

import android.content.Context
import android.content.SharedPreferences
import com.example.usecasetask.domain.model.SaveUserNameParam
import com.example.usecasetask.domain.model.UserName
import com.example.usecasetask.domain.model.repository.UserRepository
import java.security.AccessControlContext

private const val SHARED_PREFS_NAME = "shared_prefs_name"
private const val KEY_FIRST_NAME = "first_name"
private const val KEY_LAST_NAME = "last_name"
private const val DEFAULT_NAME = "Default last name"



class UserRepositoryImpl(context: Context):UserRepository {

    private val sharedPreferences = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)

    override fun saveName(saveParam: SaveUserNameParam): Boolean{

        sharedPreferences.edit().putString(KEY_FIRST_NAME, saveParam.name).apply()

        return true
    }

    override fun getName(): UserName {

        val firstName = sharedPreferences.getString(KEY_FIRST_NAME, "")?: ""
        val lastName = sharedPreferences.getString(KEY_LAST_NAME, DEFAULT_NAME)?: DEFAULT_NAME

        return UserName(firstName = firstName, lastName = lastName)

    }
}