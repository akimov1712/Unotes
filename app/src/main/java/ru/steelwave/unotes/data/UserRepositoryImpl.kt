package ru.steelwave.unotes.data

import android.app.Application
import androidx.lifecycle.LiveData
import ru.steelwave.unotes.domain.entity.UserModel
import ru.steelwave.unotes.domain.repository.UserRepository

object UserRepositoryImpl:UserRepository {

    override fun getPopularUserList(): LiveData<List<UserModel>> {
        TODO("Not yet implemented")
    }

    override suspend fun getUserItem(): UserModel {
        TODO("Not yet implemented")
    }
}