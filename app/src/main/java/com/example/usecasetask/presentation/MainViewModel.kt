package com.example.usecasetask.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.usecasetask.data.repository.UserRepositoryImpl
import com.usecasetask.data.storage.sharedprefs.SharedPrefUserStorage
import com.usecasetask.domain.model.SaveUserNameParam
import com.usecasetask.domain.model.UserName
import com.usecasetask.domain.usecase.GetUserNameUseCase
import com.usecasetask.domain.usecase.SaveUserNameUseCase

class MainViewModel(
    private val getUserNameUseCase: GetUserNameUseCase,
    private val saveUserNameUseCase: SaveUserNameUseCase
) : ViewModel() {

    private val resultLiveMutable = MutableLiveData<String>()
    val resultLive: LiveData<String> = resultLiveMutable

    init {
        Log.e("AAA", "VM CREATED")
    }

    override fun onCleared() {
        Log.e("AAA", "VM CREATED")
        super.onCleared()
    }

    fun save(text: String) {
        val params = SaveUserNameParam(name = text)
        val resultData: Boolean = saveUserNameUseCase.execute(param = params)
        resultLiveMutable.value = "Save result = $resultData"
    }

    fun load() {
        val userName: UserName = getUserNameUseCase.execute()
        resultLiveMutable.value = "${userName.firstName} ${userName.lastName}"
    }

}