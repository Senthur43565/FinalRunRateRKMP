package org.example.finalrunrater.MAIN.domain.Entities

data class BetEntity(
    val id: String,              // Unique identifier for the bet
    val user: UserEntity,              // The user who placed the bet
    val match: MatchEntity,            // The match the bet is placed on
    val amount: Double,          // Amount wagered in this bet
    val betType: EnumsforBetTypes,        // Type of bet (e.g., ball-by-ball, match winner)
    val status: EnumforBetStatus,       // Current status of the bet (e.g., pending, won, lost)
    val odds: Double?,           // The odds for the bet (optional)
    val outcome: String?,        // Outcome of the bet (e.g., "won", "lost", null if not determined yet)
    val placedAt: Long,          // Timestamp for when the bet was placed
    val settledAt: Long?         // Timestamp for when the bet was settled (optional)
)
