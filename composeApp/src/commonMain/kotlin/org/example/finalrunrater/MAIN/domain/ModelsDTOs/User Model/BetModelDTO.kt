package org.example.finalrunrater.MAIN.domain.ModelsDTOs.User



import org.example.finalrunrater.MAIN.domain.Entities.BettingOptionEntity
import org.example.finalrunrater.MAIN.domain.Enums.EnumforBetStatus


data class BetModelDTO(
    val betId: String,
    val userId: String,
    val matchId: String,
    val bettingOption: BettingOptionEntity, // The betting option chosen for the match
    val amount: Double,
    val status: EnumforBetStatus, // The current status of the bet (WIN, LOSS, PENDING, etc.)
    val placedAt: Long // Timestamp of when the bet was placed
)
