package ru.steelwave.unotes.domain.repository

import androidx.lifecycle.LiveData
import ru.steelwave.unotes.domain.entity.UserModel

interface UserRepository {

    fun getPopularUserList(): LiveData<List<UserModel>>
    suspend fun getUserItem(): UserModel

}