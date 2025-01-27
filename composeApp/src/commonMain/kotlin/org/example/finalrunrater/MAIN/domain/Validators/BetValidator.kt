package org.example.finalrunrater.MAIN.domain.Validators

import org.example.finalrunrater.MAIN.domain.Entities.BettingOptionEntity
import org.example.finalrunrater.MAIN.domain.Enums.EnumforBetStatus

object BetValidator {
    fun validateBetAmount(amount: Double, userBalance: Double): Boolean {
        return amount > 0 && amount <= userBalance // Bet must be within user's balance
    }

    fun validateBettingOption(option: BettingOptionEntity?): Boolean {
        return option != null // The betting option must exist
    }

    fun validateBetStatus(status: EnumforBetStatus): Boolean {
        return status in listOf(EnumforBetStatus.PENDING, EnumforBetStatus.WIN, EnumforBetStatus.LOSS)
    }

    fun validateMatchId(matchId: String): Boolean {
        return matchId.isNotEmpty() // Match ID must not be empty
    }
}