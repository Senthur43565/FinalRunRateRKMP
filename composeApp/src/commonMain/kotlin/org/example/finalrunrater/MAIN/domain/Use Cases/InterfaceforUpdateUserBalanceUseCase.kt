package org.example.finalrunrater.MAIN.domain.Use



interface InterfaceforUpdateUserBalanceUseCase {
    suspend fun execute(userId: String, amount: Double): Result<Boolean>
}