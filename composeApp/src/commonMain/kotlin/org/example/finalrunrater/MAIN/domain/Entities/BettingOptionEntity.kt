package org.example.finalrunrater.MAIN.domain.Entities

data class BettingOptionEntity(
    val id: String,              // Unique identifier for the betting option
    val match: MatchEntity,            // The match this betting option is associated with
    val description: String,     // A short description of the betting option (e.g., "Next ball will be a six")
    val odds: Double,            // Odds associated with the betting option
    val betType: EnumsforBetTypes         // Type of bet (e.g., ball-by-ball, total runs)
)
