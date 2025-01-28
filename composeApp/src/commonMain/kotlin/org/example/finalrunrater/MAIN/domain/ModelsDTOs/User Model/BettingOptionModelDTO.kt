package org.example.finalrunrater.MAIN.domain.ModelsDTOs.User



data class BettingOptionModelDTO(
    val optionId: String,
    val matchId: String,
    val optionName: String, // Description of the betting option (e.g., "Team 1 to win", "Player X to hit a century")
    val odds: Double // The odds for the betting option
)
