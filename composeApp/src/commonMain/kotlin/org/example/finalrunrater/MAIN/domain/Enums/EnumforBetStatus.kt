package org.example.finalrunrater.MAIN.domain.Enums

/**
Pending: You’ve made your bet, but the result isn’t decided yet.
Win: You guessed correctly and won your bet!
Loss: Unfortunately, your guess didn’t turn out as you expected.
Cancelled: Your bet isn’t happening anymore, possibly because the match was cancelled.
Settled: The game is over, and the bet has been resolved
 * **/

enum class EnumforBetStatus {
    PENDING,       // The bet is placed, but the outcome is not yet determined
    WIN,           // The bet has been won by the user
    LOSS,          // The bet has been lost by the user
    CANCELLED,     // The bet has been cancelled (could happen if the match is voided or postponed)
    SETTLED        // The bet outcome is finalized and settled (either win or loss)
}