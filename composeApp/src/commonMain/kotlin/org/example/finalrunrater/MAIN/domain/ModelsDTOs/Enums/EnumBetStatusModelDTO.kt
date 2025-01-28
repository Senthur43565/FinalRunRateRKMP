package org.example.finalrunrater.MAIN.domain.ModelsDTOs.Enums

enum class EnumBetStatusModelDTO {
    PENDING,       // Bet is placed, outcome unknown
    WIN,           // Bet is won by the user
    LOSS,          // Bet is lost by the user
    CANCELLED,     // Bet was cancelled (e.g., due to a voided match)
    SETTLED        // Bet has been settled (either won or lost)
}