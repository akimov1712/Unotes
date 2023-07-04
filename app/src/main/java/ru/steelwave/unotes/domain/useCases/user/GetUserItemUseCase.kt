package ru.steelwave.unotes.domain.useCases.user

import ru.steelwave.unotes.domain.entity.UserModel
import ru.steelwave.unotes.domain.repository.UserRepository

class GetUserItemUseCase(private val repository: UserRepository) {
    suspend operator fun invoke(): UserModel{
        return repository.getUserItem()
    }

}