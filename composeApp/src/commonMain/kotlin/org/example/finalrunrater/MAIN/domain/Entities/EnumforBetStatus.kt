package org.example.finalrunrater.MAIN.domain.Entities

enum class EnumforBetStatus {
    PENDING,       // The bet is placed, but the outcome is not yet determined
    WIN,           // The bet has been won by the user
    LOSS,          // The bet has been lost by the user
    CANCELLED,     // The bet has been cancelled (could happen if the match is voided or postponed)
    SETTLED        // The bet outcome is finalized and settled (either win or loss)
}