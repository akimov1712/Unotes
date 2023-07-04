package ru.steelwave.unotes.domain.useCases.user

import androidx.lifecycle.LiveData
import ru.steelwave.unotes.domain.entity.UserModel
import ru.steelwave.unotes.domain.repository.UserRepository

class GetPopularUserListUseCase(private val repository: UserRepository) {

    operator fun invoke(): LiveData<List<UserModel>>{
        return repository.getPopularUserList()
    }

}