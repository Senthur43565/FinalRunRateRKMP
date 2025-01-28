package org.example.finalrunrater.MAIN.domain.ModelsDTOs

data class BetDTO(
    val betId: String,
    val userId: String,
    val matchId: String,
    val bettingOptionId: String,
    val amount: Double,
    val status: String, // Serialized status (can be converted to BetStatus enum)
    val placedAt: Long
)
